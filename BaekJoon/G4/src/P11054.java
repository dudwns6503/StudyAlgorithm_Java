/*
 * BOJ 11054 가장 긴 바이토닉 부분 수열
 *
 * memory : 14808kb
 * time : 156ms
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11054 {

    private static int[] a;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int[] dp = new int[n + 1];
        int[] dp2 = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = 1;

            for (int j = 1; j < i; j++) {
                if (a[i] > a[j] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        for (int i = n; i >= 1; i--) {
            dp2[i] = 1;

            for (int j = n; j > i; j--) {
                if (a[i] > a[j] && dp2[j] + 1 > dp2[i]) {
                    dp2[i] = dp2[j] + 1;
                }
            }
        }

        int ans = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            ans = Math.max(ans, dp[i] + dp2[i] - 1);
        }

        System.out.print(ans);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        a = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
    }
}
