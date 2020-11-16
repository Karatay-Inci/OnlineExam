package Two;
/*1 3 5 7 9 11 13 15 17 19 21 
1 3 5 7 9 11 */

public class BadNews {

    public static int MAX_ODD = 23;

    public static void writeOdds() {
        for (int count = 1; count <= (MAX_ODD - 2); count++) {
            System.out.print(count + " ");
            count = count + 1;
        }

        int count = 1;
        System.out.println(count);

    }

    public static void main(String[] args) {
        writeOdds();
        MAX_ODD = 13;
        writeOdds();
    }
}