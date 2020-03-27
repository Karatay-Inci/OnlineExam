package Questions;
import java.util.Scanner;
public class E9IfElseOddEven {

   public static void main(String[] args) {
       Scanner myscanner = new Scanner(System.in);

       System.out.println("Please enter a number :");

       int number = myscanner.nextInt();

       if (number % 2 == 1) {
           System.out.println(" weird");
       } else {
           System.out.println(" not weird");
       }
   }
}
