/*
 * BOJ 2343 기타 레슨
 *
 * memory : 24044kb
 * time : 308ms
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2343 {

    private static int[] a;
    private static int n, m, sum, max;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int start = max;
        int end = sum;

        int min = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (isPossibleWithinM(mid)) {
                end = mid - 1;
                min = Math.min(min, mid);
            }
            else {
                start = mid + 1;
            }
        }

        System.out.print(min);
    }

    private static boolean isPossibleWithinM(int target) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum + a[i] > target) {
                count++;
                sum = a[i];
            } else {
                sum += a[i];
            }
        }

        return count <= m;
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        a = new int[n];
        max = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, a[i]);
            sum += a[i];
        }
    }
}
