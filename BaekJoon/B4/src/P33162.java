/*
 * BOJ 33162 散歩 (Walking)
 *
 * memory : 14136kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P33162 {

    private static int x;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int ans = 3 * (x / 2) + 3 * (x % 2);
        ans -= 2 * (x / 2);
        System.out.print(ans);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        x = Integer.parseInt(br.readLine());
    }
}
