/*
 * BOJ 1699 제곱수의 합
 *
 * memory : 14780kb
 * time : 2648ms
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1699 {

    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int[] dp = new int[n +  1];

        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;

            for (int j = 1; j <= (int)i/2; j++) {
                if (j * j == i) {
                    dp[i] = 1;
                    break;
                }
                else {
                    dp[i] = Math.min(dp[i], dp[j] + dp[i - j]);
                }
            }
        }

        System.out.print(dp[n]);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
    }
}
