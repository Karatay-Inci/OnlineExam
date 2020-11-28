package CODINGBATwarmup1;

public class A26close10 {

    /*given 2 int values, return whichever value is nearest to the value 10,
     or return 0 in the event of a tie.
     Note that Math.abs(n) returns the absolute value of a number.
    close10(8, 13) → 8
    close10(13, 8) → 8
    close10(13, 7) → 0*/
    public static void main(String[] args) {
        System.out.println(closeTen1(8, 7));
    }

    public static int closeTen(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);
        if (aDiff > bDiff) {
            return b;
        }
        if (bDiff > aDiff) {
            return a;
        }
        return 0;
    }

    public static int closeTen1(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);
        if (aDiff==bDiff){
            return 0;
        }
        else if (aDiff>bDiff){
            return b;
        }
        return a;
    }


}
