package PracticeIT;

public class P22 {
     public static void main (String [] args) {
         message1();
         message2();
         System.out.println("5.");
     }

         public static void message1() {
             System.out.println("1. (3.)");

         }
         public static void message2 () {
             System.out.println("2.");
             message1();// 3.
             System.out.println("4.");
         }



}
