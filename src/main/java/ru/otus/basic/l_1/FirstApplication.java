package ru.otus.basic.l_1;

import java.util.Scanner;

public class FirstApplication {
    // однострочный комментарий
    /*
        многострочный комментарий
     */

    // с метода main начинается исполнение кода программы
    public static void main(String[] args) {
//        print();
//        userSum();
//        localUninitializedVariable();
//        math();
//        drawBox();
//        stringConcatenation();
        ifCondition();
    }

    public static void print() {
        System.out.println("Hello world");
        System.out.println(100);
        System.out.println();
    }

    public static void userSum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a + b;
        System.out.println(result);
    }

    public static void localUninitializedVariable() {
        int a;
        // compile error: variable a might not have been initialized
//        System.out.println(a);
    }

    public static void math() {
        int a = 10;
        System.out.println(a);

        a += 10;
        System.out.println(a);

        a -= 5;
        System.out.println(a);

        int b = 100;
        a += b;
        System.out.println(a);
    }

    public static void drawBox() {
        System.out.println("========");
        System.out.println("=      =");
        System.out.println("=      =");
        System.out.println("=      =");
        System.out.println("=      =");
        System.out.println("========");
    }

    // методы нельзя объявлять внутри методов
//    public static void nestedMethod() {
//        System.out.println("some");
//
//        public static void inner() {
//            System.out.println("nested");
//        }
//    }

    public static void stringConcatenation() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }

    public static void ifCondition() {
        int temperature = 25;
        if (temperature > 20) {
            System.out.println("put on a T-shirt");
        } else {
            System.out.println("put on a jacket");
        }
    }
}

// методы нельзя объявлять вне класса
//public static void methodWithoutClass() {
//    System.out.println("some");
//}
