/*
 * BOJ 1806 부분합
 *
 * memory : 23964kb
 * time : 308ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1806 {

    private static int[] arr;
    private static int n, s, ans;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void solve() {
        ans = n + 1;

        int r = 0;
        int sum = arr[0];

        for (int l = 0; l < n; l++) {

            if (l - 1 >= 0) sum -= arr[l - 1];

            while (r + 1 <= n - 1 && sum < s) {
                sum += arr[++r];
            }

            if (sum >= s) {
                ans = Math.min(ans, r - l + 1);
            }
        }

        if (ans == n + 1) ans = 0;

        System.out.print(ans);
    }
}
