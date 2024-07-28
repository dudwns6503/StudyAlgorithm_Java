/*
 * BOJ 10819 차이를 최대로
 *
 * memory : 15368kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10819 {

    private static int[] a, selected, used;
    private static int n, max;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        rec_func(0);
        System.out.print(max);
    }

    private static void rec_func(int k) {
        if (k == n) {
            int sum = 0;
            for (int i = 0; i < selected.length - 1; i++) {
                sum += Math.abs(selected[i] - selected[i + 1]);
            }
            max = Math.max(max, sum);
        } else {
            for (int i = 0; i < n; i++) {
                if (used[i] == 1)
                    continue;

                selected[k] = a[i];
                used[i] = 1;
                rec_func(k + 1);
                selected[k] = 0;
                used[i] = 0;
            }
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        a = new int[n];
        selected = new int[n];
        used = new int[n];
        max = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
    }
}
