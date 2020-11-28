package CODINGBATwarmup1;

public class A23mixStart {

    /*Return true if the given string begins with "mix", except the 'm' can be anything, so "pix",
    "9ix" .. all count.

    mixStart("mix snacks") → true
    mixStart("pix snacks") → true
    mixStart("piz snacks") → false*/
    public static void main(String[] args) {
        System.out.println(mixStart1("pickfv"));
    }

   /* public static boolean mixStart(String str) {

    }*/

    public static boolean mixStart1(String str) {
        return str.length() >= 3 && str.substring(1, 3).equals("ix");

    }

}
