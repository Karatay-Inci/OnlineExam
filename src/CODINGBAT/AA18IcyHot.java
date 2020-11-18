package CODINGBAT;

public class AA18IcyHot {
    /*
    Given two temperatures, return true if one is less than 0 and the other is greater than 100.

    icyHot(120, -1) → true
    icyHot(-1, 120) → true
    icyHot(2, 120) → false*/
    public static void main(String[] args) {
        System.out.println(icyHot1(-1,121));

    }

    public static boolean icyHot(int temp1, int temp2) {
        if (temp1 > 100 && temp2 < 0) {
            return true;
        }
        else if (temp1<0 && temp2>100){
            return true;
        }
        else if (temp1>0 && temp2>0);
        return false;
    }
    public static boolean icyHot1(int temp1, int temp2) {
        return (temp1 * temp2 < 0) && Math.abs(temp1 - temp2) >= 102;
    }
}
