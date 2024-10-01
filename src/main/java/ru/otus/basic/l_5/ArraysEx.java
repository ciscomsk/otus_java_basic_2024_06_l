package ru.otus.basic.l_5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArraysEx {
    public static void main(String[] args) {
//        ex2();
//        ex3();
//        ex3();
//        ex4();
//        ex5();
//        sumAndPrint();
//        fillArrayHalf();
//        ex6();
//        ex7();
//        nullifyElements();
//        incrementEvenIdx();
//        ex8();
//        ex9();
//        ex10();

//        sumIntsAndPrint(5, 10);
//        sumIntsAndPrintArr(new int[]{5, 10});
//        sumIntsAndPrintVarArg(new int[]{5, 10, 15});
//        sumIntsAndPrintVarArg(5, 10, 15);

        ex11();
    }

    /**
     * !!!
     * int[] arr2 = new int[5];
     * arr2 - ссылка на области памяти, где расположен объект. Хранится в стеке
     * new int[5] - запрос на выделение памяти в куче (heap) под объект
     */

    public static void ex1() {
        int[] arr1 = {1, 2, 1, 2, 3};
        int[] arr2 = new int[5];
        boolean[] arr3 = new boolean[3];
        String[] arr4 = new String[5];
    }

    public static void ex2() {
        int[] arr1 = new int[10];
        int arr2[] = new int[10]; // можно, но не рекомендуется

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(arr1[0]);
        arr1[0] = 1;
        System.out.println(arr1[0]);
        System.out.println(arr1[arr1.length - 1]);
        arr1[1] = 4;
        arr1[4] = 2;
//        System.out.println(arr1[10]); // java.lang.ArrayIndexOutOfBoundsException
        System.out.println();

        System.out.println(arr1); // ~ [I@27716f4
        System.out.println(Arrays.toString(arr1)); // [1, 4, 0, 0, 2, 0, 0, 0, 0, 0]
    }

    public static void ex3() {
        String[] bag = new String[5];
        System.out.println(Arrays.toString(bag));

        bag[0] = "stick";
        System.out.println(Arrays.toString(bag));

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the item you want to put in the bag: ");
            String item = in.nextLine();
//            bag[0] = item;

            for (int i = 0; i < bag.length; i++) {
                if (bag[i] == null) {
                    bag[i] = item;
                    break;
                }
            }
            System.out.println(Arrays.toString(bag));
        }
    }

    public static void ex4() {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i; //  = [0, 1, 2, 3, 4]
            arr[i] = arr.length - 1 - i; // = [4, 3, 2, 1, 0]
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void ex5() {
        int[] arr = new int[5];
        fillArray(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray(int[] array, int initialValue) {
        Arrays.fill(array, initialValue);
    }

    public static void sumAndPrint() {
        int[] arr = {1, 2, 3, 4, 1, 2, 3};
        int sum = 0;

//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
        // =
//        for (int num : arr) {
//            sum += num;
//        }
        // =
        sum = Arrays.stream(arr).sum();

//        IntStream
//                .range(0, arr.length)
//                .forEach(el -> sum += el); // Variable used in lambda expression should be final or effectively final

        System.out.println(sum);
    }

    public static void fillArrayHalf() {
        int[] arr = new int[6];
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length / 2; i < arr.length; i++) {
            arr[i] = -1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void ex6() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arr));
        long evenCounter = 0;
        long positiveCounter = 0;

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                evenCounter++;
//            }
//            if (arr[i] >= 0) {
//                positiveCounter++;
//            }
//        }
        // =
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCounter++;
            }
            if (num >= 0) {
                positiveCounter++;
            }
        }
        // =
//        evenCounter = Arrays.stream(arr).filter(el -> el % 2 == 0).count();
//        positiveCounter = Arrays.stream(arr).filter(el -> el >= 0).count();
        System.out.println(evenCounter);
        System.out.println(positiveCounter);
    }

    public static void ex7() {
        int[] arr = {1, 2, 4, 4, 7, 8, 9, 3, 4, 1};
        int counter = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] - 1) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void nullifyElements() {
        int[] arr = {1, 2, 3, 4, 4, 7, 8, 9, 3, 4, 1};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 3) {
                arr[i] = 0;
            }
        }
        // =
//        IntStream.range(0, arr.length).forEach(idx -> {
//            if (arr[idx] > 3) {
//                arr[idx] = 0;
//            }
//        });

        System.out.println(Arrays.toString(arr));
    }

    public static void incrementEvenIdx() {
        int[] arr = {1, 2, 4, 4, 7, 8, 9, 3, 4, 1};
        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            if (i % 2 == 0) {
//                arr[i]++;
//            }
//        }
        // =
//        IntStream.range(0, arr.length).forEach(idx -> {
//            if (idx % 2 == 0) {
//                arr[idx]++;
//            }
//        });

        // лучшее решение
        for (int i = 0; i < arr.length; i += 2) {
            arr[i]++;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void ex8() {
        int[] arr = {1, 2, 4, 4, 7, 8, 9, 3, 4, 1};

//        for (int j : arr) {
//            System.out.print(j + " ");
//        }
//        System.out.println();
        // =
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
        //
        Arrays.stream(arr).forEach(el -> System.out.print(el + " "));
        System.out.println();
    }

    public static void ex9() {
        int[] arr1 = {1, 2, 4, 3, 7, 8, 9, 3, 4, 1};
        int[] arr2 = {5, 2, 6, 3, 2, 4, 6};
        int counter = 0;
        int minLength = Math.min(arr1.length, arr2.length);

        for (int i = 0; i < minLength; i++) {
            if (arr1[i] == arr2[i]) {
                counter++;
            }
        }

        System.out.println(counter);
    }

    public static void ex10() {
        int[] arr1 = {1, 2, 4, 3, 7, 8, 9, 3, 4, 1};
        int[] arr2 = {5, 2, 6, 3, 2, 4, 6};
        int[] arr3 = {5, 2, 6, 3, 2, 4, 6, 2, 2};
        int sum = 0;

//        for (int i = 0; i < arr1.length; i++) {
//            sum += arr1[i];
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            sum += arr2[i];
//        }
//        for (int i = 0; i < arr3.length; i++) {
//            sum += arr3[i];
//        }
        // =
//        for (int num : arr1) {
//            sum += num;
//        }
//        for (int num : arr2) {
//            sum += num;
//        }
//        for (int num : arr3) {
//            sum += num;
//        }
        // =
        sum = Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum() + Arrays.stream(arr3).sum();
        System.out.println(sum);
    }

    public static void sumIntsAndPrint(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

//    public static void sumIntsAndPrintArr(int[] array) {
//        int sum = 0;
//
////        for (int i = 0; i < array.length; i++) {
////            sum += array[i];
////        }
//        // =
////        for (int num : array) {
////            sum += num;
////        }
//        // =
//        sum = Arrays.stream(array).sum();
//
//        System.out.println(sum);
//    }

    // int... - фактически массив, поэтому конфликтует с sumIntsAndPrintArr
    public static void sumIntsAndPrintVarArg(int... nums) {
        int sum = Arrays.stream(nums).sum();
        System.out.println(sum);
    }

    public static void ex11() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        arr2 = arr1;
        arr1[1] = 5;
        arr2[2] = 10;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
