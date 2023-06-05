/*
 * BOJ 16483 접시 안의 원
 *
 * memory : 14084kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P16483 {

    private static int t;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());
    }

    private static void solve() {
        // b^2 + (t/2)^2 = a^2
        double ans = Math.pow(t / 2.0, 2.0);
        System.out.print(Math.round(ans));
    }
}
