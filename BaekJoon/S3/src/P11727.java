/*
 * BOJ 11727 2xn 타일링 2
 *
 * memory : 14288kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11727 {

    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int[] dp = new int[n + 1];

        dp[1] = 1;

        if (n >= 2)
            dp[2] = 3;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10_007;
        }

        System.out.print(dp[n]);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
    }
}
