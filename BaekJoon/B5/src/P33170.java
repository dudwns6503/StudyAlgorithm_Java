/*
 * BOJ 33170 ブラックジャック (Blackjack)
 *
 * memory : 14064kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P33170 {

    private static int a, b, c;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        if (a + b + c <= 21)
            System.out.print("1");
        else
            System.out.print("0");
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
    }
}
