/*
 * BOJ 10990 별 찍기 - 15
 *
 * memory : 17660kb
 * time : 332ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10990 {

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
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }

            if (i > 0) {
                System.out.print("*");
            }

            if (i != n - 1) System.out.println();
        }
    }
}
