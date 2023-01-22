/*
 * BOJ 1912 연속합
 *
 * memory : 23008kb
 * time : 292ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1912 {

    private static int[] arr, dp;
    private static int n, max;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        dp = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void solve() {
        dp[0] = arr[0];
        max = arr[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);

            max = Math.max(max, dp[i]);
        }

        System.out.print(max);
    }
}
