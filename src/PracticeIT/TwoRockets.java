package PracticeIT;

import org.w3c.dom.ls.LSOutput;

public class TwoRockets {
    public static void main(String[] args) {
        trangleHead();
        square();
        unitedState();
        square();
        trangleHead();

    }


    public static void trangleHead(){
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }
    public static void square(){
        System.out.println("+------+ +------+\n" +
                           "|      | |      |\n" +
                           "|      | |      |\n" +
                           "+------+ +------+");
    }
    public static void unitedState(){
        System.out.println("|United| |United|\n" +
                           "|State | |State |");
    }
}
