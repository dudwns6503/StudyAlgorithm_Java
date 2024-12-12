/*
 * BOJ 32651 인간은 무엇인가
 *
 * memory : 14168kb
 * time : 108ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P32651 {

    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        if (n > 100_000)
            System.out.print("No");
        else {
            if (n % 2024 == 0)
                System.out.print("Yes");
            else
                System.out.print("No");
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
    }
}
