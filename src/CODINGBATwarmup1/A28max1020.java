package CODINGBATwarmup1;

public class A28max1020 {
    /* Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
     or return 0 if neither is in that range.

     max1020(11, 19) → 19
     max1020(19, 11) → 19
     max1020(11, 9) → 11*/
    public static void main(String[] args) {
        System.out.println(max1020one(12, 13));
    }

    public static int max1020(int a, int b) {
        if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20) && a >= b) {
            return a;
        }
        if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20) && b >= a) {
            return b;
        }
        return 0;
    }

    public static int max1020one(int a, int b) {
        int tempa;
        int tempb;
        if (a >= 10 && a <= 20)
            tempa = a;
        else tempa = 0;

        if (b >= 10 && b <= 20)
            tempb = b;
        else tempb = 0;

        return Math.max(tempa, tempb);

    }

}
