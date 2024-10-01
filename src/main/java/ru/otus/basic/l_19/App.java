package ru.otus.basic.l_19;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        /*
            InputStream
            public abstract int read() throws IOException;
            public int read(byte[] b) throws IOException
            public int read(byte[] b, int off, int len) throws IOException
            public long skip(long n) throws IOException
            public void close() throws IOException

            OutputStream
            public abstract void write(int b) throws IOException
            public void write(byte[] b) throws IOException
            public void write(byte[] b, int off, int len) throws IOException
            public void flush() throws IOException
            public void close() throws IOException

            FileInputStream
            public int read() throws IOException
         */

//        readFile1();
//        readFile2();
//        readFile3();
//        readFile4();

//        writeFile1();
//        writeFile2();
//        writeFile3();

//        fileApi1();
//        fileApi2();
        fileApi3();
    }

    /*
        1. производительность - ОЧЕНЬ низкая (побайтовое чтение) => не использовать на практике
        2. работает корректно, только для случая, когда 1 символ кодируется 1 байтом
     */
    public static void readFile1() {
        try (FileInputStream fis = new FileInputStream("demo.txt")) {
            int n = fis.read();
            while (n != -1) {
                System.out.print((char) n);
                n = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
        1. работает значительно быстрее побайтового чтения (буфер - 64 байта)
        2. частично решает проблему кодировки
     */
    public static void readFile2() {
        try (FileInputStream fis = new FileInputStream("demo.txt")) {
            byte[] buf = new byte[64];
            int n = fis.read(buf);
            while (n > 0) {
                System.out.print(new String(buf, 0, n));
                n = fis.read(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
        1. BufferedInputStream вычитывает из файла 8192 (размер можно задать) байта в буфер (ram), в read отдает по 1 байту из буфера
        2. работает корректно, только для случая, когда 1 символ кодируется 1 байтом
        3. паттерн декоратор
     */
    public static void readFile3() {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("demo.txt"))) {
            int n = bis.read();
            while (n > 0) {
                System.out.print((char) n);
                n = bis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // посимвольное чтение
    public static void readFile4() {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("demo.txt"))) {
            int n = isr.read();
            while (n > 0) {
                System.out.print((char) n);
                n = isr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // производительность - ОЧЕНЬ низкая (побайтовая запись) => не использовать на практике
    public static void writeFile1() {
        String data = "Hello Мир!";
        // append = false - файл будет перетираться
        try (FileOutputStream fos = new FileOutputStream("out_1.txt", true)) {
            byte[] buf = data.getBytes(StandardCharsets.UTF_8);
//            for (int i = 0; i < buf.length; i++) {
//                fos.write(buf[i]);
//            }
            // =
            for (byte b : buf) {
                fos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // хорошая производительность
    public static void writeFile2() {
        String data = "Hello Мир!";
        try (FileOutputStream fos = new FileOutputStream("out_1.txt", false)) {
            byte[] buf = data.getBytes(StandardCharsets.UTF_8);
            fos.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
        1. размер внутреннего буфера - 8192 байта, запись производится ПОСЛЕ заполнения
        2. flush - позволяет не дожидаться заполнения буфера
     */
    public static void writeFile3() {
        String data = "Hello Мир!";
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("out_1.txt", false))) {
            byte[] buf = data.getBytes(StandardCharsets.UTF_8);
//            for (int i = 0; i < buf.length; i++) { // побайтовая запись в буфер
//                bos.write(buf[i]);
//            }
            // =
//            for (byte b : buf) {
//                bos.write(b);
//            }

            bos.write(buf); // запись массива в буфер
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileApi1() {
        File file = new File("resources/l_19/demo.txt");
        System.out.println(file.exists());
        System.out.println(file.length());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getParentFile().getAbsoluteFile());
        System.out.println();

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.isAbsolute());
        System.out.println(file.isHidden());
        System.out.println();

//        File file2 = new File("src/main/resources/l_19/demo_cp.txt");
//        boolean result = file.renameTo(file2);
//        System.out.println(result);

//        boolean result2 = file2.delete();
//        System.out.println(result2);
//        file.deleteOnExit();
    }

    public static void fileApi2() {
        File file = new File("src/main/resources/l_19/");
        System.out.println(file.isDirectory());
        System.out.println(Arrays.toString(file.listFiles()));
        System.out.println(Arrays.toString(file.listFiles(File::isFile)));
        System.out.println();

        File file2 = new File("src/main/resources/l_19/sub_1/sub_2");
        boolean result = file2.mkdir();
        System.out.println(result); // false
        boolean result2 = file2.mkdirs();
        System.out.println(result2); // true
    }

    public static void fileApi3() {
        File file = new File("src/main/resources/l_19/");
        System.out.println(file.getTotalSpace());
        System.out.println(file.getFreeSpace());
        System.out.println(file.getUsableSpace());
    }
}
