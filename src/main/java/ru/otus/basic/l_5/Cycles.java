package ru.otus.basic.l_5;

public class Cycles {
    public static void main(String[] args) {
//        whileExample();
//        doWhileExample();
        forExample1();
    }

    public static void whileExample() {
        int n = 0;
        while (n < 3) {
            System.out.println("Java");
            n++;
        }
    }

    public static void doWhileExample() {
        int n = 0;
        do {
            System.out.println("Java");
            n++;
        } while (n < 3);
    }

    public static void forExample1() {
        for (int i = 0; i < 3; i++) {
            System.out.print(i + ": Java\n");
        }
    }

    public static void forExample2() {
        for (int i = 0; i < 5; i++) {}

        for (int i = 0; i <= 10; i += 2) {}

        for (int i = 100; i >= 5; i -= 10) {}

        for (float i = 0.1F; i < 5.0F; i += 0.2F) {}

        for(;;) {} // = while (true)
    }
}
