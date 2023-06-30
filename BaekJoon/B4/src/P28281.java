/*
 * BOJ 28281 선물
 *
 * memory : 24024kb
 * time : 300ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P28281 {

    private static int[] socks;
    private static int n, x;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        socks = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            socks[i] = Integer.parseInt(st.nextToken()) * x;
        }
    }

    private static void solve() {
        int min = Integer.MAX_VALUE;

        int sum = socks[0];
        for (int i = 1; i < n; i++) {
            sum += socks[i];

            min = Math.min(sum, min);
            sum -= socks[i - 1];
        }

        System.out.print(min);
    }
}
