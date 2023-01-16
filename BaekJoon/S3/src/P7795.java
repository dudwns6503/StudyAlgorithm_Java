/*
 * BOJ 7795 먹을 것인가 먹힐 것인가
 *
 * memory : 34696kb
 * time : 456ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P7795 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringBuilder sb = new StringBuilder();
    private static int[] a, b;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            input();
            solve();
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb.toString());
    }

    private static void input() throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        a = new int[n + 1];
        b = new int[m + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void solve() {
        Arrays.sort(b, 1, m + 1);

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += lower_bound(b, a[i], 1, m);
        }

        sb.append(ans).append("\n");
    }

    private static int lower_bound(int[] b, int target, int l, int r) {
        int result = l - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (b[mid] < target) {
                result = mid;
                l = mid + 1;
            } else if (b[mid] >= target){
                r = mid - 1;
            }
        }

        return result;
    }
}
