package ru.otus.basic.l_2;

public class MainApplication {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        drawSquare();
        feature1Method();
    }

    public static void drawSquare() {
        System.out.println("----");
        System.out.println("-  -");
        System.out.println("-  -");
        System.out.println("----");
    }

    public static void feature1Method() {
        System.out.println("1234");
        int n = 10;
        n++;
        System.out.println(n);
    }
}
