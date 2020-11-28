package CODINGBATwarmup1;

public class A4Diff21 {
    /*
    Given an int n, return the absolute difference between n and 21,
     except return double the absolute difference if n is over 21.*/
    public static void main(String[] args) {
        System.out.println("diff21= "+diff21(21));
        System.out.println("diff21one= "+diff21one(22));
        System.out.println("diff21two= "+diff21two(30));


    }
    public static int diff21(int n) {
      if (n<=21){
          return 21-n;
      }
      else  {
            return (n - 21) * 2;
        }
    }
    public static int diff21one(int n){
        if (n<=21){
            return 21-n;
        }
        return (n-21)*2;
    }
    public static int diff21two(int n){
        int result = Math.abs(n-21);
        if (n<=21){
            return result ;
        }
        return result * 2 ;
    }

}
