package Questions2R;

public class R1 {
    //1. Write a program (WAP) to reverse a given string.
    public static void main(String[] args) {

        String word="reverse";

        String a="";

        for (int i = word.length()-1; i >=0 ; i--) {

            a=a+word.charAt(i);
        }
        System.out.println(a);
    }
}
