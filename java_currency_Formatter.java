import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        String us = nf.format(payment);
        nf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = nf.format(payment);
        nf = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
        String china = nf.format(payment);
        nf = NumberFormat.getCurrencyInstance(new Locale("fr", "FR"));
        String france = nf.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
