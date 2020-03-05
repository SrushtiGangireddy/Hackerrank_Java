import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        ArrayList<String> inputLines = new ArrayList<String>();

        while(sc.hasNext()) {
            inputLines.add(sc.nextLine());
        }
        int i=1;
        for(String il: inputLines) {
            System.out.println(i++ + " " + il);
        }
    }
}
