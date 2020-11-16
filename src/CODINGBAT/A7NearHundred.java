package CODINGBAT;

public class A7NearHundred {
    /*
    Given an int n, return true if it is within 10 of 100 or 200.
    Note: Math.abs(num) computes the absolute value of a number.
*/
    public static void main(String[] args) {
        System.out.println(nearHundred(100));
        System.out.println("nearHundred1 = "+nearHundred1(200));

    }
    public static boolean nearHundred(int n) {
        return (Math.abs(100-n)<=10 || Math.abs(200 - n)<=10);  //????

    }
    public static boolean nearHundred1(int n) {
        if (Math.abs(n-100) <=10 || Math.abs(n-200) <= 10){
            return true;
        }
        return false;
    }

}
