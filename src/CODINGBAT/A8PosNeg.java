package CODINGBAT;

public class A8PosNeg {
    /*
    Given 2 int values, return true if one is negative and one is positive.
     Except if the parameter "negative" is true, then return true only if both are negative.
    posNeg(1, -1, false) → true
    posNeg(-1, 1, false) → true
    posNeg(-4, -5, true) → true*/
    public static void main(String[] args) {
        System.out.println(posNeg(-7,-1,true));

    }
    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative==true){
            return a<0 && b<0;
        }
        return ((a<0 && b>=0) || (a>=0 && b<0));     //  ^ ---> XOR --> or use this --->  return a<0 ^ b<0;

    }
}
