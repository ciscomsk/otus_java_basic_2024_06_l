package ru.otus.basic.l_4;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        hello();
//        simpleGuessTheNumber();
//        advancedGuessTheNumber();
//        calculator();
//        charOps();
//        toBinary();
        typeCasting();
        acmpExample();
    }

    public static void hello() {
        System.out.println("Hello world!");
    }

    public static void simpleGuessTheNumber() {
        System.out.println("*** Guess the number simple ***");

//        int aiNumber = (int) (Math.random() * 10); // = [0, 9]
        int aiNumber = 1 + (int) (Math.random() * 9); // = [1, 9]
        System.out.println("The computer guessed a number in the range from 1 to 9");

        Scanner sc = new Scanner(System.in);
        int userNumber;
        do {
            System.out.println("Enter numbers in the range from 1 to 9: ");
            userNumber = sc.nextInt();
        } while (userNumber < 1 || userNumber > 9);

        if (userNumber == aiNumber) {
            System.out.println("You won!");
        } else {
            System.out.println("You lose!");
        }

        System.out.println("The number " + aiNumber + " was guessed");
    }

    public static void advancedGuessTheNumber() {
        System.out.println("*** Guess the number advanced ***");

        Scanner sc = new Scanner(System.in);
        int difficulty;
        do {
            System.out.println("Select difficulty level: \n1 - easy\n2 - medium\n3 - hard");
            difficulty = sc.nextInt();
        } while (difficulty < 1 || difficulty > 3);

        int maxNumber;
        int triesCount;

        // v1
        if (difficulty == 1) {
            maxNumber = 6;
            triesCount = 3;
        } else if (difficulty == 2) {
            maxNumber = 9;
            triesCount = 3;
        } else {
            maxNumber = 15;
            triesCount = 2;
        }

        // v2 - такое себе
//        switch (difficulty) {
//            case 1 -> {
//                maxNumber = 6;
//                triesCount = 3;
//            }
//            case 2 -> {
//                maxNumber = 9;
//                triesCount = 3;
//            }
//            default -> {
//                maxNumber = 15;
//                triesCount = 2;
//            }
//        }

        int aiNumber = 1 + (int) (Math.random() * maxNumber);
        System.out.println("The computer guessed a number in the range from 1 to " + maxNumber);

        int userNumber;
        while (true) {
            do {
                System.out.println("Enter numbers in the range from 1 to " + maxNumber + ": ");
                userNumber = sc.nextInt();
            } while (userNumber < 1 || userNumber > 9);

            if (userNumber == aiNumber) {
                System.out.println("You won!");
                break;
            } else if (userNumber < aiNumber) {
                System.out.println("The hidden number is greater");
            } else {
                System.out.println("The hidden number is less");
            }

            triesCount--;
            System.out.println("Attempts left: " + triesCount);

            if (triesCount == 0) {
                System.out.println("You lose!");
                break;
            }
        }

        System.out.println("The number " + aiNumber + " was guessed");
    }

    public static void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float a = sc.nextFloat();
        System.out.println("Enter the second number: ");
        float b = sc.nextFloat();
        System.out.println("Enter operation +, -, *, / : ");
        char operation = sc.next().charAt(0);

//        float result;
//        if (operation == '+') {
//            result = a + b;
//        } else if (operation == '-') {
//            result = a - b;
//        } else if (operation == '*') {
//            result = a * b;
//        } else if (operation == '/') {
//            result = a / b;
//        } else {
//            System.out.println("Unknown operation: " + operation);
//            return;
//        }

        // v2
        float result = switch (operation) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> throw new IllegalStateException("Unknown operation: " + operation);
        };

        System.out.println(a + " " + operation + " " + b + " = " + result);
    }

    public static void charOps() {
        // ASCII

        char ch1 = 53; // = (char) 53 = 5
        char ch2 = '5';
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println();

        char ch3 = ' ' + ' ' + 1; // = 32 + 32 + 1 = A
        System.out.println(ch3);
    }

    public static void toBinary() {
        System.out.println(Integer.toBinaryString(5)); //        101
        System.out.println(Integer.toBinaryString(127)); //  1111111
        System.out.println(Integer.toBinaryString(128)); // 10000000

        System.out.println(Integer.toBinaryString(56765)); // 1101110110111101
        System.out.println();

        byte a = 127;
        System.out.println(a); // 127
        a++;
        System.out.println(a); // -128
    }

    public static void typeCasting() {
//        int i1 = 5L; // compile error: incompatible types: possible lossy conversion from long to int

        long l1 = 5L;
        long l2 = 7;

//        short s = 35000; // compile error: incompatible types: possible lossy conversion from int to short

//        float f1 = 6.8; // compile error: incompatible types: possible lossy conversion from double to float
        float f2 = 6.8F;

        double d1 = 6.877777777777777777;
        float f3 = (float) 6.877777777777777777;
        System.out.println(d1); // 6.877777777777778
        System.out.println(f3); // 6.8777776
        System.out.println();

        int i2 = (int) f3;
        System.out.println(i2); // 6
    }

    public static void acmpExample() {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        out.println(a + b);

        out.flush();

    }
}
