package ru.otus.basic.l_7;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
//        double sqrt = Math.sqrt(10);
//        System.out.println(sqrt);
//
//        float n = 10.5F;
//        float res = someCalculation(n);
//        System.out.println("we got the value: " + res);

        nestedLoop();


//        new Object()

    }

    public static float someCalculation(float n) {
        float result = n * 2 - 10 * (n / 4) + 1;

        if (result > 100) {
            result /= 4;
        }
        if (result < 2.5F) {
            result += 10;
        }

        return ++result;
    }

    public static void doSomething(int n) {
        if (n < 0) {
            return;
        }
        System.out.println(n);
    }

    public static long sumEvenElements(int[] arr) {
        long sum = 0;

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                sum += arr[i];
//            }
//        }
        // =
//        for (int num : arr) {
//            if (num % 2 == 0) {
//                sum += num;
//            }
//        }
//        return sum;
        // =
        return Arrays.stream(arr).filter(el -> el % 2 == 0).sum();
    }

    public static void nestedLoop() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
