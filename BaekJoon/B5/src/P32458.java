/*
 * BOJ 32458 Just Round Down
 *
 * memory : 14256kb
 * time : 100ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P32458 {

    private static double d;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        System.out.print((int) d);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        d = Double.parseDouble(br.readLine());
    }
}
