package ru.otus.basic.l_3;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
//        print();
        userInput();
//        variables();
//        calc();
//        constant();
//        dataTypes();
//        math();
//        ifCondition();
//        printSum(10, 20);
//        whileExample();
//        doWhileExample();
//        drawRectangle(4);
//        randomIntGenerator();
    }

    public static void print() {
        System.out.println("Hello World");
        System.out.println();

        System.out.print("Hello");
        System.out.print(" world");
        System.out.println();
        System.out.println();

        int a = 100;
        System.out.println("Some text: " + a + " some text");
        System.out.println();

        System.out.println("ABC\nABC\nABC");
    }

    public static void userInput() {
        Scanner sc = new Scanner(System.in);

        int userNum = sc.nextInt();
        int result = (userNum * 10);
        System.out.println("you entered the number: " + userNum);
        System.out.println("result: " + result);

        // ? текст ввести не предлагается
        // + нужен дополнительный sc.nextLine();
        sc.nextLine();
        String userText = sc.nextLine();
        System.out.println("you entered the text: " + userText);

        System.out.println("end");
    }

    public static void variables() {
        // int m - объявление переменной
        // = 100 - инициализация переменной
        int m = 100;
        m += 10;
        System.out.println(m);

        int z;
        // нельзя использовать непроинициализированную локальную переменную
//        System.out.println(z); // compile error: Variable 'z' might not have been initialized

        String internalWebPage = "some_page";
    }

    public static void calc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int a = sc.nextInt();
        System.out.println("enter second number: ");
        int b = sc.nextInt();
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
    }

    public static void constant() {
        final int temperature = 10;
//        temperature += 5; // compile error: Cannot assign a value to final variable 'temperature'
    }

    public static void dataTypes() {
        int a = 11;
//        a = "str"; // compile error: incompatible types: java.lang.String cannot be converted to int
        a /= 3;
        System.out.println(a); // 3 - дробная часть отбрасывается

        float f = 11F;
        f /= 3;
        System.out.println(f); // 3.6666667
        System.out.println();

        boolean bool = true;

        byte b = 127;
        System.out.println(b); // 127
        b++;
        System.out.println(b); // -128
        System.out.println();

        float fl1  = 1.12345678912345F;
        double dl1 = 1.12345678912345;
        System.out.println(fl1);
        System.out.println(dl1);
        System.out.println();

//        float fl2 = 1.12345678912345; // compile error: incompatible types: possible lossy conversion from double to float
        float fl3 = (float) 1.12345678912345; // type casting
        double dl2 = 1.12345678912345F; // ok
        System.out.println(fl3); // 1.1234568
        System.out.println(dl2); // 1.1234568357467651
        System.out.println();

        String str = "Java Core";
    }

    public static void math() {
        int n = 3;
        String message = (n % 2 == 0) ? "even" : "odd";
        System.out.println(message);
    }

    public static void ifCondition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int a = sc.nextInt();
        System.out.println("enter second number: ");
        int b = sc.nextInt();

        System.out.println("enter operation: \n1. +\n2. -\n3. *\n4. /");
        int operation = sc.nextInt();

        // v1
        int result;
        String strOperation;
        if (operation == 1) {
            strOperation = "+";
            result = a + b;
        } else if (operation == 2) {
            strOperation = "-";
            result = a - b;
        } else if (operation == 3) {
            strOperation = "*";
            result = a * b;
        } else if (operation == 4) {
            strOperation = "/";
            result = a / b;
        } else {
            throw new IllegalArgumentException("Unknown operation");
        }

        // v2
//        int result = switch(operation) {
//            case 1 -> a + b;
//            case 2 -> a - b;
//            case 3 -> a * b;
//            case 4 -> a / b;
//            default -> throw new IllegalArgumentException("Unknown operation");
//        };
//
//        String strOperation = switch(operation) {
//            case 1 -> "+";
//            case 2 -> "-";
//            case 3 -> "*";
//            case 4 -> "/";
//            default -> throw new IllegalArgumentException("Unknown operation");
//        };

        // v3 - лучше сразу принимать операцию как строку

        System.out.println(a + " " + strOperation + " " + b + " = " + result);
    }

    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum );

        // нельзя объявить метод внутри другого метода
//        public static void method() {} // compile error: class, interface, enum, or record expected
    }

    public static void whileExample() {
        int a = 0;
        // while: проверка -> итерация
        while (a < 3) {
            System.out.println("Java");
            a++;
        }

        // бесконечный цикл
//        while (true) {}

        int b = 0;
        while (true) {
            if (b == 10) {
                break;
            }
            b++;
        }
    }

    public static void doWhileExample() {
        Scanner sc = new Scanner(System.in);
        int n;
        // do while: итерация -> проверка, те отработает хотя бы 1 раз
        do {
            System.out.println("enter a number from 1 to 10: ");
            n = sc.nextInt();
        } while (n < 1 || n > 10);
        System.out.println("n = " + n);
    }

    public static void drawRectangle(int height) {
        if (height < 1) {
            return;
        }

        int n = 0;
        while (n < height) {
            System.out.println("====");
            n++;
        }
    }

    public static void randomIntGenerator() {
        // Math.random() = [0, 1.0)
        int n = (int)(Math.random() * 10); // = [0, 9]
        System.out.println("n = " + n);
    }
}
