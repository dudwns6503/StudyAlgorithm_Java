/*
 * BOJ 2440 별 찍기 - 3
 *
 * memory : 14984kb
 * time : 236ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2440 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        solve(n);
    }

    private static void solve(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }
            if (i != n - 1) System.out.println();
        }
    }
}
