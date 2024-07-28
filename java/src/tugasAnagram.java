import java.lang.reflect.Array;
import java.util.Arrays;
public class tugasAnagram {

    public static boolean cekAnagram(String s1, String s2) {
        String str1 = s1.replace(" ", "").toLowerCase();
        String str2 = s2.replace(" ", "").toLowerCase();

       if (str1.length() != str2.length()){
           return false;
       }
        else {
           char c1 [] = str1.toLowerCase().toCharArray();
           char c2 [] = str2.toLowerCase().toCharArray();
           Arrays.sort(c1);
           Arrays.sort(c2);
           return Arrays.equals(c1,c2);
       }
    }

    public static void main(String[] args) {
        String c1 = "CAT";
        String c2 = "tad";
        System.out.println("Apakah " + c1 + " dan "+ c2+ " Anagram " +cekAnagram(c1,c2));
        System.out.println(cekAnagram("Cat","Tac"));
    }
}