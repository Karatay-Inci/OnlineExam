package CODINGBAT;

public class A3SumDouble {
    /*
    Given two int values, return their sum.
     Unless the two values are the same, then return double their sum.
    sumDouble(1, 2) → 3
    sumDouble(3, 2) → 5
    sumDouble(2, 2) → 8*/

    public static void main(String[] args) {
        System.out.println("sumDouble= "+sumDouble(2, 22));   //????
        System.out.println("sumDouble1= "+sumDouble1(9, 9));
        System.out.println("sumDouble2= "+sumDouble2(4, 4));
        System.out.println("sumDouble3= "+sumDouble3(7, 6));
        System.out.println("sumDouble4= "+sumDouble4(5,4));

    }

    public static int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            return sum;
        }
        return 2 * sum;
    }

    public static int sumDouble1(int a, int b) {
        int sum = a + b;
        if (a != b)
            return 2 * sum;
        return sum;

    }

    public static int sumDouble2(int a, int b) {

        if (a == b)
            return a + b;
        return 2 * (a + b);

    }

    public static int sumDouble3(int a, int b) {
        if (a != b)
            return 2 * (a + b);
        return a + b;
    }
    public static int sumDouble4(int a, int b) {      ///????
     return (a==b) ? 4 * a : a+b;
    }
}

