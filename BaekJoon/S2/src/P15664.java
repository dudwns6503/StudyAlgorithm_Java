/*
 * BOJ 15664 N과 M (10)
 *
 * memory : 14400kb
 * time : 144ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P15664 {

    private static StringBuilder sb = new StringBuilder();
    private static Set<String> set = new LinkedHashSet<>();
    private static int[] numbers, selected;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        numbers = new int[n];
        selected = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);
    }

    private static void solve() {
        rec_func(0, 0);

        set.iterator().forEachRemaining(s -> sb.append(s).append("\n"));
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static void rec_func(int cnt, int k) {
        if (cnt == m) {
            for (int i = 0; i < m; i++) {
                sb.append(selected[i]).append(" ");
            }

            sb.deleteCharAt(sb.length() - 1);
            set.add(sb.toString());
            sb = new StringBuilder();
            return;
        }

        for (int i = k; i < n; i++) {
            selected[cnt] = numbers[i];
            rec_func(cnt + 1, i + 1);
            selected[cnt] = 0;
        }
    }
}
