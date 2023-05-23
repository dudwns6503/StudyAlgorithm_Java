/*
 * BOJ 20492 세금
 *
 * memory : 14092kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P20492 {

    private static StringBuilder sb = new StringBuilder();
    private static int money;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        money = Integer.parseInt(br.readLine());
    }

    private static void solve() {
        one();
        two();

        System.out.print(sb);
    }

    private static void one() {
        int minus = money * 22 / 100;
        sb.append(money - minus).append(" ");
    }

    private static void two() {
        int minus = (int) (money * 0.2) * 22 / 100;
        sb.append(money - minus);
    }
}
