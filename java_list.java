import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }

        int q = sc.nextInt();

        for(int i=0;i<q;i++) {
            String query = sc.next();
            if (query.equals("Insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                arr.add(x, y);
            } else {
                int x = sc.nextInt();

                arr.remove(x);
            }
        } 

        for(int el: arr) {
            System.out.print(el+" ");
        }
    }
}
