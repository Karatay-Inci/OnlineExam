package CODINGBAT;

public class A24startOz {

    /*Given a string, return a string made of the first 2 chars (if present),
    however include first char only if it is 'o' and include the second only if it is 'z',
    so "ozymandias" yields "oz".

    startOz("ozymandias") → "oz"
    startOz("bzoo") → "z"
    startOz("oxx") → "o"*/
    public static void main(String[] args) {
        System.out.println(startOz("ozulku"));
    }
    public static String startOz(String str) {
     if (str.startsWith("oz"))
         return "oz";
     if (str.startsWith("o"))
         return "o";
     if (str.startsWith("z",1))
         return "z";
     return str;


    }


}
