package Questions2R;

public class B2ForLoopAstericks {
    public static void main(String[] args) {

        for (int line=0; line <6; line++) {

            for (int i=0; i<(6-line); i++) {

                System.out.print(" ");
            }
            for (int i=0; i <(2*line-1); i++) {


                System.out.print("*");

            }
            System.out.println();
        }
    }
}
