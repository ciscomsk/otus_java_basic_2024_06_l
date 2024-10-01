package ru.otus.basic.l_3.add;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysPlayground {
    public static void main(String[] args) {
//        arrayExample();
//        dynamicInitialization();
//        dim2Array();
//        sumFirstAndLast();
//        arraySum();
//        sumPositive();
//        zeroArrayRightHalf();
//        compareSecondAndPenultimate();
//        countGE10();
        printEvenElements();
    }

    public static void arrayExample() {
        int[] arr = new int[4];
        arr[0] = 10;
        arr[3] = 20;
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void dynamicInitialization() {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {10, 9, 8, 7, 6};
        String[] arr3 = {"A", "B", "C"};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 7
//        arr1[10] = 1000;
    }

    public static void dim2Array() {
        int[][] arr = new int[3][4];
        int val = 1;
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = val;
                val++;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

    public static void sumFirstAndLast() {
        int[] arr = {1, 2, 3, 3, 2, 1};
        int sum = arr[0] + arr[arr.length - 1];
        System.out.println(sum);
    }

    public static void arraySum() {
        int[] arr = {1, 2, 3, 3, 2, 1};

        int sum1 = 0;
        // v1
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }

        int sum2 = 0;
        // v2
        for (int num : arr) {
            sum2 += num;
        }

        int sum3 = Arrays.stream(arr).sum();

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }

    public static void sumPositive() {
        int[] arr = {1, 2, -3, 3, 0, -1};

        int sum1 = 0;
        // v1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum1 += arr[i];
            }
        }

        int sum2 = 0;
        // v2
        for (int num : arr) {
            if (num > 0) {
                sum2 += num;
            }
        }

        // v3
        int sum3 = Arrays.stream(arr).filter(num -> num > 0).sum();

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }

    public static void zeroArrayRightHalf() {
        int[] arr = {1, 2, -3, 3, 20, -1};
        for (int i = arr.length / 2; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void compareSecondAndPenultimate() {
        int[] arr = {1, 2, 3, 3, 2, 1};
        if (arr[1] > arr[arr.length - 2]) {
            System.out.println("Right");
        }
    }

    public static void countGE10() {
        int[] arr = {1, 2, 3, 3, 2, 1, 11, 12};

        int count1 = 0;
        // v1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 10) {
                count1++;
            }
        }

        int count2 = 0;
        // v2
        for (int num : arr) {
            if (num >= 10) {
                count2++;
            }
        }

        // v3
        long count3 = Arrays.stream(arr).filter(num -> num >= 10).count();

        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
    }

    public static void printEvenElements() {
        int[] arr = {1, 2, 3, 3, 2, 1};

        // v1
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        // v2
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\n");

        // v3
        IntStream
                .range(0, arr.length)
                .filter(idx -> idx % 2 == 0)
                .forEach(idx -> System.out.print(arr[idx] + " "));

    }
}
