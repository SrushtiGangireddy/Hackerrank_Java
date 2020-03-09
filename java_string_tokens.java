import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        s = removeLeadingNonAlpha(s);

        if (s.length() == 0) {
            System.out.println(0);
            return;
        }


        String[] words = s.split("\\P{Alpha}+");
        System.out.println(words.length);
        for(int i=0;i<words.length;i++) {
            System.out.println(words[i]);
        }
    }

    public static String removeLeadingNonAlpha(String s) {
        int i;
        for(i=0;i<s.length();i++) {
            if (Character.isLetter(s.charAt(i))) {
                break;
            }
        }
        return s.substring(i);
    }
}

