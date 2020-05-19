package PracticeIT.Two;

public class BJP3SelfCheckNumberTotalQ {
    public static void main(String[] args) {
        int total =25;
        for (int i = 1; i <=total/2 ; i++) {
            total = total -i;
            System.out.println(total+" "+i);

        }
    }
}
