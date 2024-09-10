/*
 * BOJ 32154 SUAPC 2024 Winter
 *
 * memory : 14056kb
 * time : 100ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P32154 {

    private static int n;
    private static String[][] board = {{"11", "A B C D E F G H J L M"},
            {"9", "A C E F G H I L M"},
            {"9", "A C E F G H I L M"},
            {"9", "A B C E F G H L M"},
            {"8", "A C E F G H L M"},
            {"8", "A C E F G H L M"},
            {"8", "A C E F G H L M"},
            {"8", "A C E F G H L M"},
            {"8", "A C E F G H L M"},
            {"8", "A B C F G H L M"}};

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        System.out.println(board[n-1][0]);
        System.out.print(board[n-1][1]);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
    }
}
