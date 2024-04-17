public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(5,5));
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static boolean isEven(int x) {
        if (x % 2 == 1) {
            return false;
        } else {
            return true;
        }
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static String convertToUppercase(String x) {
        return x.toUpperCase();
    }

    public static boolean isNumberPositive(int x) {
        if (x <= 0) {
            return false;
        } else {
            return true;
        }
    }
}
