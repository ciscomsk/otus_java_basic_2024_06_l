// без package - compile error: Missing package statement: 'ru.otus.basic.l_3.add'
package ru.otus.basic.l_3.add;

import java.util.Scanner;

//public class javaBasic { // compile error: Class 'javaBasic' is public, should be declared in a file named 'javaBasic.java'
public class JavaBasic {

//    public static void Main(String[] args) { // Main - валидное имя метода валидно, но это не точка входа в программу - запустить уже не получится
    public static void main(String[] args) {
//        hello();
//        variables();
//        constant();
//        arithmetic();
//        consolePrint();
//        userInput();
        ifCondition();
    }

    public static void hello() {
//        System.out.println("Hello, World!!!") // compile error: ';' expected
//        system.out.println("Hello, World!!!"); // compile error: Cannot resolve symbol 'system'
        System.out.println("Hello, World!!!");

    // если закомментить { - compile error: '}' expected
    }

    public static void variables() {
        int a = 1000;
        float b;
        b = 2.25F;
        char ch = '(';

        int n;
        // нельзя использовать непроинициализированные локальные переменные
//        System.out.println(n); // compile error: Variable 'n' might not have been initialized

        // динамическая инициализация
        int w = 10, h = 10, l = 10;
        int vol = w * h * l;
    }

    public static void constant() {
        final int constant = 200;
    }

    public static void arithmetic() {
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

        val = 500;
        System.out.println(val);
    }

    public static void consolePrint() {
        int n = 50;

        System.out.println(100);
        System.out.println(0.1F);
        System.out.println(true);
        System.out.println(false);
        System.out.println(n);
    }

    public static void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int result = sc.nextInt();
        System.out.println(result);
    }

    public static void ifCondition() {
        Scanner sc = new Scanner(System.in);
        int currentTemp = 27;
        System.out.println("Enter desired temperature: ");
        int targetTemp = sc.nextInt();

        String mode;
        if (targetTemp > currentTemp) {
            mode = "Heat";
        } else if (targetTemp < currentTemp) {
            mode = "Cooling";
        } else {
            mode = "The room temperature is the desired temperature, do nothing required";
        }
        System.out.println(mode);

        boolean boolValue = true;
        if (boolValue) {}
        if (!boolValue) {}
    }

}
