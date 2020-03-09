import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	final Pattern pattern = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
            final Matcher matcher = pattern.matcher(line);
            boolean found = false;
            while (matcher.find()) {
                found = true;
                System.out.println(matcher.group(2));
            }

            if (!found) {
                System.out.println("None");
            }
			
			testCases--;
		}
	}
}



