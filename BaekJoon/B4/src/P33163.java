/*
 * BOJ 33163 OIJ (OIJ)
 *
 * memory : 14132kb
 * time : 100ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P33163 {

    private static String s;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == 'J')
                sb.append("O");
            else if (c == 'O')
                sb.append("I");
            else
                sb.append("J");
        }

        System.out.print(sb);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        s = br.readLine();
    }
}
