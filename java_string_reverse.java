import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int len = A.length();
        /* Enter your code here. Print output to STDOUT. */
        boolean flag = true;
        for(int i=0,j=len-1;i<len/2;i++,j--) {
            if (A.charAt(i) != A.charAt(j)) {
                flag = false;
                System.out.println("No");
                break;
            } 
        }

        if (flag) {
            System.out.println("Yes");
        }

    }
}



