/*
 * BOJ 13909 창문 닫기
 *
 * memory : 14252kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P13909 {

    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
    }

    private static void solve() {
        System.out.print((int) Math.floor(Math.sqrt(n)));
    }
}
