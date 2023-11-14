/*
 * BOJ 27328 三方比較 (Three-Way Comparison)
 *
 * memory : 14172kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P27328 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        solve(a, b);
    }

    private static void solve(int a, int b) {
        if (a > b)
            System.out.print("1");
        else if (a == b)
            System.out.print("0");
        else
            System.out.print("-1");
    }
}
