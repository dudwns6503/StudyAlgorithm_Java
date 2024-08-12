/*
 * BOJ 10824 네 수
 *
 * memory : 14364kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10824 {

    private static String a, b, c, d;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        long left = Long.parseLong(a + b);
        long right = Long.parseLong(c + d);

        System.out.print(left + right);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = st.nextToken();
        b = st.nextToken();
        c = st.nextToken();
        d = st.nextToken();
    }
}
