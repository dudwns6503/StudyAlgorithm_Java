/*
 * BOJ 28061 레몬 따기
 *
 * memory : 34944kb
 * time : 388ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P28061 {

    private static int[] lemons;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        lemons = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            lemons[i] = Integer.parseInt(st.nextToken()) - (n - i);
        }
    }

    private static void solve() {
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            ans = Math.max(lemons[i], ans);
        }

        System.out.print(ans);
    }
}
