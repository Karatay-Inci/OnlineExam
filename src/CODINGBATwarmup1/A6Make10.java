package CODINGBATwarmup1;

public class A6Make10 {
    /*Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.*/
    public static void main(String[] args) {
        System.out.println(makes10(1,3));
        System.out.println(makes10one(3,7));

    }
    public static boolean makes10(int a, int b) {
        if (a+b==10){
            return true;
        }
        if(a==10 || b==10){
            return true;
        }
        return false;
    }
    public static boolean makes10one(int a, int b){
        return (( a==10 && b==10) || (a+b==10));
    }
}
