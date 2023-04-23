/*
 * BOJ 22857 가장 긴 짝수 연속한 부분 수열 (small)
 *
 * memory : 41040kb
 * time : 368ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P22857 {

    private static int[] num;
    private static int n, k;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        num = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void solve() {
        int[][] dp = new int[k + 1][n + 1];

        /*
         *  짝수일 경우 dp[i][j] = dp[i][j - 1] + 1
         *  홀수일 경우 dp[i][j] = dp[i - 1][j - 1]
         */
        for (int j = 1; j <= n; j++) {
            if (num[j] % 2 == 0) dp[0][j] = dp[0][j - 1] + 1;

            for (int i = 1; i <= k; i++) {
                if (num[j] % 2 == 0) dp[i][j] = dp[i][j - 1] + 1;
                else dp[i][j] = dp[i - 1][j - 1];
            }
        }

        int ans = 0;

        for (int i = 1; i <= n; i++) {
            ans = Math.max(ans, dp[k][i]);
        }

        System.out.print(ans);
    }
}
