package INTERVIEW;

import java.util.HashSet;
import java.util.Set;

public class Uniq {
    /*/*
     * String s = aacbbcc allowed = 2
     Bu soruda 2 tane unique character bulunduran en uzun substringi bulacagiz.
     sonuc =   cbbcc olmali */
    public static void main(String[] args) {
        String str="aacbbccdfgabdfgh";
        System.out.println(question(str));
    }
    public static int question(String str){
        if (str== null || str.length()==0){
            return 0;
        }
        Set<Character> set= new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        return set.size();
    }
}
