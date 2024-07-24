/*
 * BOJ 1920 수 찾기
 *
 * memory : 48408kb
 * time : 644ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1920 {

    private static int[] a, b;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        Arrays.sort(a);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int num = binarySearch(b[i], 0, a.length - 1);

            if (num == -1)
                sb.append("0").append("\n");
            else
                sb.append("1").append("\n");
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }

    private static int binarySearch(int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;

            if (a[mid] == target)
                return mid;
            else if (a[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return -1;
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        a = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        m = Integer.parseInt(br.readLine());
        b = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
    }
}
