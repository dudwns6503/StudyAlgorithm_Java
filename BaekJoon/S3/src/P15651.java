/*
 * BOJ 15651 N과 M(3)
 *
 * memory : 67928kb
 * time : 452ms
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15651 {

    private static StringBuilder sb;
    private static int[] selected;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        input();
        solve();
        print();
    }

    private static void solve() {
        sb = new StringBuilder();
        selected = new int[n + 1];

        rec_func(1);
    }

    private static void rec_func(int k) {
        if (k == m + 1) {
            for (int i = 1; i <= m; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        } else {
            for (int cand = 1; cand <= n; cand++) {
                selected[k] = cand;
                rec_func(k + 1);
                selected[k] = 0;
            }
        }
    }

    private static void print() {
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
    }
}
