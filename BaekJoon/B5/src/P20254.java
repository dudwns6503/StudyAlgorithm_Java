/*
 * BOJ 20254 Site Score
 *
 * memory : 14128kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P20254 {

    private static int u0, t0, ur, tr;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ur = Integer.parseInt(st.nextToken());
        tr = Integer.parseInt(st.nextToken());
        u0 = Integer.parseInt(st.nextToken());
        t0 = Integer.parseInt(st.nextToken());

        solve();
    }

    private static void solve() {
        System.out.print(56 * ur + 24 * tr + 14 * u0 + 6 * t0);
    }
}
