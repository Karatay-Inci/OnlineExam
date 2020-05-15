package PracticeIT;

public class EggStop {
    public static void main(String[] args) {
        egg1();
        System.out.println();
        egg1();
        plusLine();
        stopLine();
        plusLine();

    }
    public static void egg1(){
        System.out.println("  ______\n" +
                           " /      \\\n" +
                           "/        \\\n" +
                          "\\        /\n" +
                          " \\______/");
    }
    public static void plusLine(){
        System.out.println("+--------+");
        System.out.println();
    }
    public static void stopLine(){
        System.out.println("  ______\n" +
                            " /      \\\n" +
                            "/        \\\n" +
                            "|  STOP  |\n" +
                            "\\        /\n" +
                            " \\______/");
    }
}
