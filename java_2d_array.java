import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int sum = Integer.MIN_VALUE;

        for(int i=0;i<6;i++) {
            for(int j=0;j<6;j++) {
                if(hasHourGlass(i,j,6,6)) {
                    int temp_sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                    if (sum < temp_sum) {
                        sum = temp_sum;
                    }

                }
            }
        }

        System.out.println(sum);

        scanner.close();
    }

    public static boolean hasHourGlass(int i, int j, int m, int n) {
        if (((j+2) < n) && ((i+1) < m && (j+1) < n) && ((i+2) < m)) {
            return true;
        } 
        return false;
    }
}
