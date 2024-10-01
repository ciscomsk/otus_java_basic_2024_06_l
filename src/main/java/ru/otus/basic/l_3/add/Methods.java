package ru.otus.basic.l_3.add;

public class Methods {
    public static void main(String[] args) {
//        int result = sum(1, 2, 3, 4);
//        System.out.println(result);
//        printDoubleHello();
//        printDoubleText("some text");

        // нельзя объявлять переменные в круглых скобках при вызове методов
//        printDoubleText(String text = "som text"); // compile error: ',' or ')' expected

//        printTen();
//        sumAndPrint(1, 2, 3);
        boolean res = isABiggerThanB(5, 10);
        System.out.println(res);
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void printDoubleHello() {
        System.out.println("Hello");
        System.out.println("Hello");
    }

    public static void printDoubleText(String text) {
        System.out.println(text);
        System.out.println(text);

        // нельзя объявлять методы внутри методов
//        public static void innerMethod() {} // compile error: Expression expected
    }

    // compile error: Missing return statement
//    public static boolean wrongReturn(int val) {
//        if (val < 0) {
//            return true;
//        }
//    }

    public static void printTen() {
        System.out.println(10);
        System.out.println(10);
        System.out.println(10);
    }

    public static void sumAndPrint(int a, int b, int c) {
        int result = a + b + c;
        System.out.println(result);
    }

    public static boolean isABiggerThanB(int a, int b) {
        return a > b;
    }
}
