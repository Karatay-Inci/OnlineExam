package CODINGBATwarmup1;

public class A9NotString {
    /*Given a string, return a new string where "not " has been added to the front.
    However, if the string already begins with "not", return the string unchanged.
    Note: use .equals() to compare 2 strings.

    notString("candy") → "not candy"
    notString("x") → "not x"
    notString("not bad") → "not bad"*/
    public static void main(String[] args) {
        System.out.println(notString("bad"));

    }

    public static String notString(String str) {
        int len =str.length();
        if (len>=3 && str.substring(0,3).equals("not")){
            return str;
        }
        return "not " + str; //why does put space here
    }
}
