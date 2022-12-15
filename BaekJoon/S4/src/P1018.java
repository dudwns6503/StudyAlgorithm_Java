/*
 * BOJ 1018 체스판 다시 칠하기
 *
 * memory : 14308kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1018 {

    static boolean[][] board;
    static int n, m, ans = 64;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);

        board = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            for (int j = 0; j < m; j++) {
                if (str.charAt(j) == 'W') board[i][j] = true; // W일 때는 true
                else board[i][j] = false;                     // B일 때는 false
            }
        }
    }

    private static void solve() {
        int n_max = n - 7;
        int m_max = m - 7;

        for (int i = 0; i < n_max; i++) {
            for (int j = 0; j < m_max; j++) {
                find(i, j);
            }
        }
        System.out.print(ans);
    }

    private static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        boolean TF = board[x][y]; // 첫 번째 칸의 색

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                if (board[i][j] != TF) {
                    count++;
                }
                TF = !TF;
            }
            TF = !TF;
        }

        count = Math.min(count, 64 - count);

        ans = Math.min(ans, count);
    }
}
