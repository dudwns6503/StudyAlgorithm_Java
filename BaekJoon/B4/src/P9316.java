/*
 * BOJ 9316 Hello Judge
 *
 * memory : 14100kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P9316 {

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
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb.append("Hello World, Judge ").append(i).append("!");
            if (i != n) sb.append("\n");
        }

        System.out.print(sb);
    }
}
