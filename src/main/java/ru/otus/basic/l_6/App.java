package ru.otus.basic.l_6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 5, 9, 3, 7};
//        max(arr);

//        String[] fruits =
//                {"apple", "plum", "kiwi", "pear", "pineapple", "grape", "strawberry", "cherry", "banana", "orange"};

//        guessTheWord(fruits);
//        guessTheWordChars(fruits);
//        guessTheWordCharsCount(fruits);

//        fieldOfDreams(fruits);

        Backpack bp = new Backpack();
        bp.add("flashlight");
        bp.add("flashlight");
        bp.add("flashlight");
        bp.add("flashlight");
        bp.add("flashlight");
        bp.add("rope");
        bp.print();
        System.out.println(bp.count());
        bp.remove("flashlight");
        bp.remove("shovel");
        bp.print();
        System.out.println(bp.count());
        bp.add("flashlight");
    }

    public static void max(int[] arr) {
//        int max = Integer.MIN_VALUE; // v1 - но ограничены int
        int max = arr[0]; // v2

        for (int i = 0; i < arr.length; i++) { // оптимизация: i = 1
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // =
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        // =
        max = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
        System.out.println(max);
    }

    public static void guessTheWord(String[] arr) {
        Scanner in = new Scanner(System.in);
        // v1
        int randomIdx = (int) (Math.random() * arr.length); // Math.random = [0, 1) * 10 = [0, 10)
        // v2
//        int randomIdx = new Random().nextInt(arr.length); // nextInt(arr.length) = [0, 10)

        boolean win = false;
        while (!win) {
            String hiddenWord = arr[randomIdx];
            System.out.println("guess the fruit: ");
            String userWord = in.next();

            if (userWord.equals(hiddenWord)) {
                System.out.println("you guessed!");
                win = true;
            } else {
                System.out.println("you guessed wrong");
            }
        }
        // =
//        do {
//            String hiddenWord = arr[randomIdx];
//            System.out.println("guess the fruit: ");
//            String userWord = in.next();
//
//            if (userWord.equals(hiddenWord)) {
//                System.out.println("you guessed!");
//                break;
//            }
//        } while (true);
    }

    public static void guessTheWordChars(String[] arr) {
        Scanner in = new Scanner(System.in);
        int randomIdx = (int) (Math.random() * arr.length);

        boolean win = false;
        while (!win) {
            String hiddenWord = arr[randomIdx];
            System.out.println("guess the fruit: ");
            String userWord = in.next();

            char[] hiddenWordChars = hiddenWord.toCharArray();
            char[] userWordChars = userWord.toCharArray();
            int minLength = Math.min(hiddenWordChars.length, userWordChars.length);

            for (int i = 0; i < minLength; i++) { // i < hiddenWordChars.length && i < userWordChars.length - без доп переменных и методов
                if (userWordChars[i] == hiddenWordChars[i]) {
                    System.out.print(userWordChars[i]);
                } else {
                    System.out.print("*");
                }
            }

            for (int i = 0; i < 10 - minLength; i++) {
                System.out.print("*");
            }
            System.out.println();

            if (userWord.equals(hiddenWord)) {
                System.out.println("you guessed!");
                win = true;
            } else {
                System.out.println("you guessed wrong");
            }
        }
    }

    public static void guessTheWordCharsCount(String[] arr) {
        Scanner in = new Scanner(System.in);
        int randomIdx = (int) (Math.random() * arr.length);

        System.out.println("entered number of attempts:");
        int attemptsCount = in.nextInt();

        for (int i = 0; i < attemptsCount; i++) {
            String hiddenWord = arr[randomIdx];
            System.out.println("guess the fruit: ");
            String userWord = in.next();

            char[] hiddenWordChars = hiddenWord.toCharArray();
            char[] userWordChars = userWord.toCharArray();
            int minLength = Math.min(hiddenWordChars.length, userWordChars.length);

            for (int j = 0; j < minLength; j++) { // i < hiddenWordChars.length && i < userWordChars.length - без доп переменных и методов
                if (userWordChars[j] == hiddenWordChars[j]) {
                    System.out.print(userWordChars[j]);
                } else {
                    System.out.print("*");
                }
            }

            for (int j = 0; j < 10 - minLength; j++) {
                System.out.print("*");
            }
            System.out.println();

            if (userWord.equals(hiddenWord)) {
                System.out.println("you guessed!");
                break;
            } else {
                System.out.println("you guessed wrong");
            }
        }
    }

    public static void fieldOfDreams(String[] arr) {
        Scanner in = new Scanner(System.in);
        int randomIdx = new Random().nextInt(arr.length);
        String hiddenWord = arr[randomIdx];
        char[] hiddenWordChars = hiddenWord.toCharArray();

        char[] result = new char[hiddenWord.length()];
        Arrays.fill(result,'*');

        boolean win = false;
        while (!win) {
            System.out.println("enter a letter: ");
            char letter = in.next().charAt(0);

            for (int i = 0; i < result.length; i++) {
                if (hiddenWordChars[i] == letter) {
                    result[i] = letter;
                }
            }
            String output = new String(result);
            System.out.println(output);

            if (!output.contains("*")) {
                win = true;
            }
        }
    }
}
