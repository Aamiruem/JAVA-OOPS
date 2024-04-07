package L14Polymorphism;

public class MethodOverloading {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static String sum(String x, String y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum("Indian ", "Hacker"));
    }
}
