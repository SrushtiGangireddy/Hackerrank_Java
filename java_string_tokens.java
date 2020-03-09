import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        String[] words = s.split("\\P{Alpha}+");
        System.out.println(words.length);
        for(int i=0;i<words.length;i++) {
            System.out.println(words[i]);
        }
    }
}

