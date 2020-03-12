import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            if (input == null || input.length() == 0) {
                System.out.println("true");
            } else {
                Stack<Character> st = new Stack<Character>();
                char[] ch = input.toCharArray();

                for(int i=0;i<ch.length;i++) {
                    
                    if (ch[i] == '{' || ch[i] == '[' || ch[i] == '(') {
                        st.push(ch[i]);
                    } else {
                        if (st.size() > 0) {
                            char output = st.pop();
                        if ((ch[i] == '}' && output == '{') ||
                            (ch[i] == ']' && output == '[') || 
                            (ch[i] == ')' && output == '(')) {

                            } else {
                                st.push(output);
                            }
                        } else {
                            st.push(ch[i]);
                        }
                    }
                }
                if (st.size() > 0) {
                    System.out.println("false");
                } else {
                    System.out.println("true");
                }
            
            }
		}
		
	}
}



