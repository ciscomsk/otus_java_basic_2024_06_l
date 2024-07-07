package ru.otus.basic.l_1;

public class Pdf {
    public static void main(String[] args) {
//        helloWorld();
//        dataTypes();
//        arithmetics();
//        printHelloThreeTimes();
//        sumAndPrint();
        ifCondition();
    }

    public static void helloWorld() {
        System.out.println("Hello World");
    }

    public static void dataTypes() {
        int temperature = 10;
        int bobAge = 24;

        float x;
        x = 21.12F;
        System.out.println(x);
    }

    public static void arithmetics() {
        int val = 10;

        val++; // = val += 1
        System.out.println(val);

        val--;
        System.out.println(val);

        val += 10;
        System.out.println(val);

        val -= 10;
        System.out.println(val);

        val *= 10;
        System.out.println(val);

        val /= 10;
        System.out.println(val);
    }

    public static void printHelloThreeTimes() {
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }

    public static void sumAndPrint() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("sum: " + sum);
    }

    public static void ifCondition() {
        int a = 10;
        int b = 20;
        int sum = a + b;

        if (a > 10) {
            System.out.println("the value of the variable a is strictly greater than 10");
        }

        if (a != 10) {
            System.out.println("the value of variable a is not equal to 10");
        }

        if (sum >= 0) {
            System.out.println("the sum of a and b is greater than or equal to 0");
        }

        if (a == b) {
            System.out.println("the value of variable a is equal to the value of variable b");
        }
    }
}
