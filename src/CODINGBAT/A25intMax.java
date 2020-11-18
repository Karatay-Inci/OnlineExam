package CODINGBAT;

public class A25intMax {

    /*Given three int values, a b c, return the largest.
    intMax(1, 2, 3) → 3
    intMax(1, 3, 2) → 3*/
    public static void main(String[] args) {
        System.out.println(intMax1(44, 5, 6));
    }

    public static int intMax(int a, int b, int c) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static int intMax1(int a, int b, int c) {
        int num1 = (Math.max(a, b));
        int num2 = (Math.max(num1, c));
        return num2;
    }
}
