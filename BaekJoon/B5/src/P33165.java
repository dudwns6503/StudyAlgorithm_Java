/*
 * BOJ 33165 徒競走 (Footrace)
 *
 * memory : 14096kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P33165 {

    private static int t, v;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        System.out.print(t * v);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());
        v = Integer.parseInt(br.readLine());
    }
}
