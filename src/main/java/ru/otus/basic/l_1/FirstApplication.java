package ru.otus.basic.l_1;

import java.util.Scanner;

public class FirstApplication {
    // однострочный комментарий

    /*
        многострочный
        комментарий
     */

    // с метода main начинается исполнение кода программы
    public static void main(String[] args) {
//        print();
//        compileErrors();
//        userSum();
//        localUninitializedVariable();
//        math();
//        drawBox();
//        stringConcatenation();
        ifExample();
    }

    public static void print() {
        System.out.println("Hello world");
        System.out.println(100);
        System.out.println();
    }

    public static void compileErrors() {
//        int x = 0 // compile error: ';' expected

//        system.out.println(); // compile error: package system does not exist

//        /System.out.println(); // compile error: illegal start of expression

//        int a = true; // compile error: incompatible types: boolean cannot be converted to int

//        int void = 10; // compile error: not a statement
    }

    public static void userSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        int result = a + b;
        System.out.println("sum: " + result);
    }

    public static void localUninitializedVariable() {
        int a; // аллокация без инициализации
//        System.out.println(a); // compile error: variable a might not have been initialized
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

    public static void ifExample() {
        int temperature = 20;
        if (temperature >= 20) {
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
