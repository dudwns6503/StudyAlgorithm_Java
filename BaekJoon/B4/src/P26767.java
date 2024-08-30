/*
 * BOJ 26767 Hurra!
 *
 * memory : 44148kb
 * time : 356ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P26767 {

    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0 && i % 11 == 0)
                sb.append("Wiwat!");
            else if (i % 7 == 0)
                sb.append("Hurra!");
            else if (i % 11 == 0)
                sb.append("Super!");
            else
                sb.append(i);

            sb.append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
    }
}
