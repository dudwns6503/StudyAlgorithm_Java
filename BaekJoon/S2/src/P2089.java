/*
 * BOJ 2089 -2진수
 *
 * memory : 14200kb
 * time : 100ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2089 {

    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        if (n == 0) {
            System.out.print(0);
            return;
        }

        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            int remainder = Math.abs(n % -2);

            n = (int) Math.ceil((double) n / -2);
            sb.insert(0, remainder);
        }

        System.out.print(sb);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
    }
}
