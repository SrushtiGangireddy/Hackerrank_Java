import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
       if (a.length() != b.length()) {
           return false;
       } else {
           int[] aCharCount = new int[256];
           int[] bCharCount = new int[256];


           for(int i=0; i<a.length(); i++) {
               aCharCount[a.charAt(i)]++;
           }

           for(int i=0; i<b.length(); i++) {
               bCharCount[b.charAt(i)]++;
           }

           for (int i=0; i<256; i++) {
               if (aCharCount[i] != bCharCount[i]) {
                   return false;
               }
           }
       }
       return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
