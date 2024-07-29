/*
 * BOJ 10826 피보나치 수 4
 *
 * memory : 21280kb
 * time : 180ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P10826 {

    private static BigInteger[] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new BigInteger[n + 1];

        dp[0] = BigInteger.ZERO;
        if (n >= 1)
            dp[1] = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 2].add(dp[i - 1]);
        }

        System.out.print(dp[n]);
    }
}
