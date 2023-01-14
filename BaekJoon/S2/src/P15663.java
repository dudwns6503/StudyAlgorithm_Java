/*
 * BOJ 15663 N과 M (9)
 *
 * memory : 34372kb
 * time : 324ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P15663 {

    private static StringBuilder sb = new StringBuilder();
    private static Set<String> set;
    private static int[] numbers, selected;
    private static boolean[] used;
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

        set = new LinkedHashSet<>();

        numbers = new int[n];
        used = new boolean[n];
        selected = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);
    }

    private static void solve() {
        rec_func(0);

        for (String s : set) {
            sb.append(s).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static void rec_func(int cnt) {
        if (cnt == m) {
            for (int i = 0; i < m; i++) {
                sb.append(selected[i]).append(" ");
            }

            sb.deleteCharAt(sb.length() - 1);
            set.add(sb.toString());
            sb = new StringBuilder();
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (!used[i]) {
                used[i] = true;
                selected[cnt] = numbers[i];
                rec_func(cnt + 1);
                used[i] = false;
                selected[cnt] = 0;
            }
        }
    }
}
