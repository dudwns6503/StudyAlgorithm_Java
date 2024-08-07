/*
 * BOJ 10844 쉬운 계단 수
 *
 * memory : 14208kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10844 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int mod = 1_000_000_000;
        long[][] dp = new long[n + 1][10];

        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j + 1] % mod;
                } else if (j == 9) {
                    dp[i][j] = dp[i - 1][j - 1] % mod;
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod;
                }
            }
        }

        long sum = 0;
        for (int i = 0; i <= 9; i++) {
            sum += dp[n][i];
        }

        System.out.print(sum % mod);
    }
}
