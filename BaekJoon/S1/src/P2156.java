/*
 * BOJ 2156 포도주 시식
 *
 * memory : 14872kb
 * time : 148ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2156 {

    private static int[] wines, dp;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        wines = new int[n + 1];
        dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            wines[i] = Integer.parseInt(br.readLine());
        }
    }

    private static void solve() {
        /**
         * 포도주를 규칙에 따라서 마시는 경우는 총 3가지이다. 그리고 이를 점화식으로 나타내면
         *  i - 2 | i - 1 | i
         *    O      O      X   => dp[i-1]
         *    O      X      O   => dp[i-2] + wines[i]
         *    X      O      O   => dp[i-3] + wines[i - 1] + wines[i]
         *
         *  이의 최댓값을 구한 후 dp[n]을 출력하면 된다.
         */
        dp[1] = wines[1];

        if (n > 1) {
            dp[2] = wines[1] + wines[2];
        }

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + wines[i], dp[i - 3] + wines[i - 1] + wines[i]));
        }

        System.out.print(dp[n]);
    }
}
