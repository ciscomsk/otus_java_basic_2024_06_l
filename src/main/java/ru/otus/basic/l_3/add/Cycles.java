package ru.otus.basic.l_3.add;

public class Cycles {
    public static void main(String[] args) {
//        forExample();
        nestedLoops();
    }

    public static void forExample() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
        System.out.println();

        // элементы цикла разделяются символом ;
//        for (int i = 0, i < 3, i++) {
//            System.out.println(i);
//        }

        // после тела цикла ; не ставится - цикл будет работать некорректно
//        for (int i = 0; i < 3; i++); {
//            System.out.println(i);
//        }
    }

    public static void nestedLoops() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("i = " + i + ", j = " + j + "; ");
            }
            System.out.println();
        }
    }

}
