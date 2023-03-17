/*
 * BOJ 1182 부분수열의 합
 *
 * memory : 15304kb
 * time : 176ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1182 {

    private static int[] arr, selected;
    private static int n, s, ans;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n];
        selected = new int[n];
        ans = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void solve() {
        rec_func(0);
        if (s == 0) ans--;
        System.out.print(ans);
    }

    private static void rec_func(int cnt) {
        if (cnt == n) {
            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum += selected[i];
            }

            if (sum == s) {
                ans++;
            }
        } else {
            selected[cnt] = arr[cnt];
            rec_func(cnt + 1);
            selected[cnt] = 0;
            rec_func(cnt + 1);
        }
    }
}
