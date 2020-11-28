package CODINGBATwarmup1;

public class AA17StartHi {
    /*
    Given a string, return true if the string starts with "hi" and false otherwise.
    startHi("hi there") → true
    startHi("hi") → true
    startHi("hello hi") → false*/
    public static void main(String[] args) {
        System.out.println(startHi1("hello"));
    }

    public static boolean startHi(String str) {
        if(str.startsWith("hi")){
            return true;

        }return false;

    }
    public static boolean startHi1(String str){
        if (str.substring(0,2).equals("hi"))   //why does not substring active
            return true;
        return false;
    }

}
