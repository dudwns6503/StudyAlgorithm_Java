/*
 * BOJ 15654 N과 M (5)
 *
 * memory : 28580kb
 * time : 356ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P15654 {

    private static StringBuilder sb = new StringBuilder();
    private static int[] numbers;
    private static int[] used;
    private static int[] selected;
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
        used = new int[numbers[numbers.length - 1] + 1];
    }

    private static void solve() {
        rec_func(0);

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static void rec_func(int cnt) {
        if (cnt == m) {
            for (int i = 0; i < m; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        }
        else {
            for (int i = 0; i < n; i++) {
                if (used[numbers[i]] == 1) continue;

                selected[cnt] = numbers[i];
                used[numbers[i]] = 1;
                rec_func(cnt+1);
                selected[cnt] = 0;
                used[numbers[i]] = 0;
            }
        }
    }
}
