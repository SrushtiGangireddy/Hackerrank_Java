import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        BigInteger a = new BigInteger(s);
        s = sc.nextLine();
        BigInteger b = new BigInteger(s);
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
