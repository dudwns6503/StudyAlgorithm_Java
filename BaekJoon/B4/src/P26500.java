/*
 * BOJ 26500 Absolutely
 *
 * memory : 14484kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P26500 {

    private static StringBuilder sb = new StringBuilder();
    private static double a, b;

    public static void main(String[] args) throws Exception {
        input();
}

    private static void solve() {
        double max = Math.max(a, b);
        double min = Math.min(a, b);
        sb.append(String.format("%.1f", Math.abs(max - min))).append("\n");
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            a = Double.parseDouble(st.nextToken());
            b = Double.parseDouble(st.nextToken());

            solve();
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
