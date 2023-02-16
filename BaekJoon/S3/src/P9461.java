/*
 * BOJ 9461 파도반 수열
 *
 * memory : 14188kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P9461 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringBuilder sb = new StringBuilder();
    private static long[] dp;

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(br.readLine());

        dp = new long[101];

        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= 100; i++) {
            dp[i] = dp[i-2] + dp[i-3];
        }

        while (t-- > 0) {
            inputAndSolve();
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static void inputAndSolve() throws Exception {
        int n = Integer.parseInt(br.readLine());
        sb.append(dp[n]).append("\n");
    }
}
