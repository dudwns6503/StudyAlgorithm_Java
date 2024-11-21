/*
 * BOJ 2847 게임을 만든 동준이
 *
 * memory : 14128kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2847 {

    private static int[] level;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int ans = 0;
        for (int i = n; i > 1; i--) {
            int current = level[i];
            int previous = level[i - 1];

            if (current <= previous) {
                ans += (previous - current + 1);
                level[i - 1] -= (previous - current + 1);
            }
        }

        System.out.print(ans);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        level = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            level[i] = Integer.parseInt(br.readLine());
        }
    }
}
