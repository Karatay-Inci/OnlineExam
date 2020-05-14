package PracticeIT;

public class StarFigure {
    public static void main(String[] args) {
        starsTwoline();
        System.out.println();
        starsTwoline();
        starsOneLine();
        starsTwoline();

    }
    public static void starsTwoline(){
        System.out.println("*****\n"+"*****\n"+" * *\n"+"  * \n"+" * *");
    }
    public static void starsOneLine(){
        System.out.println("*****\n"+"*****\n"+"\n"+"  *  \n"+"  *  \n"+"  *  ");
    }
}
