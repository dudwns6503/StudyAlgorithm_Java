/*
 * BOJ 2523 별 찍기 - 13
 *
 * memory : 15688kb
 * time : 268ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2523 {

    private static int n;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        solve();
    }

    private static void solve() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
