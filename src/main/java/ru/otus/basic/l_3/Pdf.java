package ru.otus.basic.l_3;

import java.util.Scanner;

public class Pdf {
    public static void main(String[] args) {
//        print();
//        dataTypes();
//        constant();
//        arithmetics();
//        booleanLogic();
//        sumAndPrint(10, 25);
//        whileExample();
//        breakExample();
//        scannerExample();
        randomIntGenerator();
    }

    public static void print() {
        int n = 100;
        System.out.println(n);
        System.out.println("n = " + n);
        System.out.println("Hello World");
        System.out.println("Hello World" + 10);
        System.out.print("A");
        System.out.print("B");
        System.out.println("A");
        System.out.println("A" + 1 + "B" + 2 + 1); // A1B21
        System.out.println("A" + 1 + "B" + (2 + 1)); // A1B3
        System.out.println(1 + 2 + "A"); // 3A
        System.out.println("A\nB\nC");
    }

    public static void dataTypes() {
        int temperature = 10;
        int bobAge = 24;
        float x;
        x = 21.12F;
    }

    public static void constant() {
        final int temperature = 10;
//        temperature += 10; // compile error: cannot assign a value to final variable temperature
    }

    public static void arithmetics() {
        int val1 = 10;

        val1++; // = val += 1
        System.out.println(val1);

        val1--;
        System.out.println(val1);

        val1 += 10;
        System.out.println(val1);

        val1 -= 10;
        System.out.println(val1);

        val1 *= 10;
        System.out.println(val1);

        val1 /= 10;
        System.out.println(val1);
        System.out.println();

        int val2 = 20 % 7;
        System.out.println(val2);
    }

    public static void booleanLogic() {
        System.out.println(10 > 5); // true
        System.out.println(5 > 10); // false
        System.out.println(2 > 1 && 3 > 0); // true
        System.out.println(1 > 0 ||  0 > 1); // true
        System.out.println(!(10 > 0)); // false
        System.out.println();

        int temperature = 20;
        boolean isCold = temperature < -20;
        if (temperature > 25) {}
        System.out.println();

        int x = 5;
        System.out.println(!(x != 10) && x > 0); // false
        System.out.println();

        int a = 1;
        int b = 2;
        System.out.println(a + b > 0); // true
        System.out.println();

        a = 10;
        b = 20;
        boolean bool = true;

        if (a > 10 && a < 20) {}
        if (a == 0 || a > 100) {}
        if (a ==0 || b == 0) {}
        if (bool) {}
        if (!bool) {}
    }

    public static void sumAndPrint(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public static void whileExample() {
        int a = 1;
        while (a < 1000) {
            a *= 10;
            System.out.println(a);
        }
    }

    public static void breakExample() {
        int a = 10;
        while (true) {
            a++;
            System.out.println(a);
            if (a > 14) {
                break;
            }
        }
    }

    public static void scannerExample() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer: ");
        int result = sc.nextInt();
        System.out.println(result);
    }

    public static void randomIntGenerator() {
        // Math.random() = [0, 1.0)
        int rnd = (int) (Math.random() * 10); // [1, 9]
        System.out.println(rnd);
    }
}
