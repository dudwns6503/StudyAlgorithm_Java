/*
 * BOJ 27110 특식 배부
 *
 * memory : 14260kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P27110 {

    private static int n, a, b, c;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        solve();
    }

    private static void solve() {
        int sum = 0;

        sum += Math.min(a, n);
        sum += Math.min(b, n);
        sum += Math.min(c, n);

        System.out.print(sum);
    }
}
