/*
 * BOJ 14501 퇴사
 *
 * memory : 14272kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14501 {

    private static int[] t, p;
    private static int n, ans = Integer.MIN_VALUE;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        t = new int[n];
        p = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void solve() {
        rec_func(0, 0);
        System.out.print(ans);
    }

    private static void rec_func(int cnt, int sum) {
        if (cnt == n) {
            if (ans < sum) {
                ans = sum;
            }
            return;
        }

        // 퇴사 일을 넘긴 경우.(불가능)
        if (cnt > n) return;

        // 주어진 날에 상담을 할 경우 이전 합계에 p[cnt]를 더하고, t[cnt]만큼 넘어간다.
        rec_func(cnt + t[cnt], sum + p[cnt]);

        // 상담을 하지 않고 넘어갈 경우 이전 합계만 넘긴다.
        rec_func(cnt + 1, sum);
    }
}
