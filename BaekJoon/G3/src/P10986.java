/*
 * BOJ 10986 나머지 합
 *
 * memory : 112724kb
 * time : 492ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10986 {

    static int[] count;
    static int n, m;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        count = new int[m];
        int sum = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            sum = (sum + num) % m;
            count[sum]++;
        }
    }

    private static void solve() {
        long ans = count[0];

        for (int i = 0; i < m; i++) {
            ans += (long) count[i] * (count[i] - 1) / 2;
        }

        System.out.print(ans);
    }
}
