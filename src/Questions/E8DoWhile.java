package Questions;

public class E8DoWhile {
    public static void main(String[] args) {
        double a;
        int b=0;
        do {
            b+=2;
            a=b;
        }
        while(b<6);
        System.out.println(a);
    }
}
