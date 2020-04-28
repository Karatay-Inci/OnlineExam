package PracticeIT;

public class P28 {
    public static void main(String[] args) {

        method2();
        System.out.println();
        method1();
        System.out.println();
        method3();
        System.out.println();
        method2();
    }
    public static void method2(){
        method1();
        System.out.println("I am method 2.");
    }
    public static void method3(){
        method2();
        System.out.println("I am method 3.");
        method1();
    }
    public static void method1(){
        System.out.println("I am method 1.");
    }

}
