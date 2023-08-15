/*
 * BOJ 28352 10!
 *
 * memory : 14140kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P28352 {

    private static long[] dp;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        dp = new long[n + 1];

        solve();
    }

    private static void solve() {
        dp[0] = 0;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = i * dp[i - 1];
        }

        System.out.print(dp[n] / (24 * 60 * 60 * 7));
    }
}
