package PRACTICEitBOOK;

public class A1ForLoopSquare {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i+" squared = "+(i*i));
        }
        System.out.println("------------------");

        for (int j = -10; j <=10; j++) {
            System.out.println(j+" squared = "+(j*j));
        }
        System.out.println("------------------");

        for (int i = (2 + 2); i <= (4 * 3); i++) {
            System.out.println(i + " squared = " + (i * i));
        }
        System.out.println("------------------");
        System.out.println("------------------");

        for (int i = 1; i <= 6; i++)        //pay attention   -->  {  }
            System.out.println("Hi!");
            System.out.println("Hello!");

        System.out.println("------------------");
        System.out.println("------------------");

        for (int i = 1; i <= 6; i++) {
            System.out.println("Hi!");
            System.out.println("Hello!");
        }
        System.out.println("------------------");
        System.out.println("------------------");

        for (int i = 1; i <= 6; i++) {
            System.out.println("Hi!");
        }
        System.out.println("Hello!");

        System.out.println("------------------");
        System.out.println("------------------");

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 10; j++) {     //inner loop
                System.out.print("*");
            }
            System.out.println(); }

        System.out.println("------------------");
        System.out.println("------------------");

        for (int i = 1; i <=6; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------");
        System.out.println("------------------");

        for (int i = 1; i <=6; i++) {
            for (int j = i; j <=6 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// page 95