/*
 * BOJ 24084 次の文字 (Next Character)
 *
 * memory : 14236kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P24084 {

    private static int n;
    private static String s;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == 'J')
                sb.append(s.charAt(i - 1)).append("\n");
        }

        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            System.out.print(sb);
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        s = br.readLine();
    }
}
