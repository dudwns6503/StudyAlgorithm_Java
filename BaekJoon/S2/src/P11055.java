/*
 * BOJ 11055 가장 큰 증가하는 부분 수열
 *
 * memory : 14528kb
 * time : 152ms
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11055 {

    private static int[] a;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int[] dp = new int[n + 1];

        int ans = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            dp[i] = a[i];

            for (int j = 1; j < i; j++) {
                if (a[i] > a[j]) {
                    dp[i] = Math.max(dp[j] + a[i], dp[i]);
                }
            }

            ans = Math.max(ans, dp[i]);
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
