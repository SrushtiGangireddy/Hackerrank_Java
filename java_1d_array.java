import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return canWinHelper(game, leap, 0);
    }

    public static boolean canWinHelper(int[] game, int leap, int st) {
        if (st >= game.length)
            return true;
        else if (st < 0 || game[st]==1) 
            return false;
        
        game[st] = 1;

        return canWinHelper(game, leap, st+leap) || canWinHelper(game, leap, st+1) || canWinHelper(game, leap, st-1); 
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
 
}
