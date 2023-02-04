/*
 * BOJ 11050 이항 계수 1
 *
 * memory : 14216kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11050 {

    private static int n, k;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        /**
         *  // nCk ==>             n!
         *               //    ---------
         *               //     k!(n-k)!
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        int[] dp = new int[n + 1];

        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] * i;
        }

        int ans = 0;
        if (n == k || k == 0) {
            ans = 1;
        } else {
            ans = dp[n] / (dp[k] * dp[n - k]);
        }

        System.out.print(ans);
    }
}
