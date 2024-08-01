/*
 * BOJ 9465 스티커
 *
 * memory : 114372kb
 * time : 864ms
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9465 {

    private static StringBuilder sb = new StringBuilder();
    private static int[][] stickers;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());

            stickers = new int[2][n];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                stickers[0][j] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                stickers[1][j] = Integer.parseInt(st.nextToken());
            }

            solve();
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }

    private static void solve() {
        int[][] dp = new int[2][n];

        dp[0][0] = stickers[0][0];
        dp[1][0] = stickers[1][0];

        if (n > 1) {
            dp[0][1] = dp[1][0] + stickers[0][1];
            dp[1][1] = dp[0][0] + stickers[1][1];
        }

        for (int i = 2; i < n; i++) {
            dp[0][i] = Math.max(dp[1][i - 1], dp[1][i - 2]) + stickers[0][i];
            dp[1][i] = Math.max(dp[0][i - 1], dp[0][i - 2]) + stickers[1][i];
        }

        sb.append(Math.max(dp[0][n - 1], dp[1][n - 1])).append("\n");
    }
}
