/*
 * BOJ 33169 所持金 (Money On Me)
 *
 * memory : 14060kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P33169 {

    private static int a, b;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        System.out.print(a * 1000 + b * 10000);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
    }
}
