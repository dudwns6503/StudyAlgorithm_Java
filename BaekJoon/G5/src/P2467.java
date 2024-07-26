/*
 * BOJ 2467 용액
 *
 * memory : 28680kb
 * time : 396ms
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2467 {

    private static int[] a;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int start = 0;
        int end = n - 1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sumMin = Integer.MAX_VALUE;

        while (start < end) {
            if (Math.abs(a[start] + a[end]) < sumMin) {
                sumMin = Math.abs(a[start] + a[end]);

                min = a[start];
                max = a[end];

                if (a[start] + a[end] < 0)
                    start++;
                else
                    end--;
            } else {
                if (a[start] + a[end] < 0)
                    start++;
                else
                    end--;
            }
        }

        System.out.print(min + " " + max);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
    }
}
