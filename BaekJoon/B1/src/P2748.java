/*
 * BOJ 2748 피보나치 수 2
 *
 * memory : 14268kb
 * time : 140ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2748 {

    private static long[] dp;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        init();

        System.out.print(dp[n]);
    }

    private static void init() {
        dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
    }
}
