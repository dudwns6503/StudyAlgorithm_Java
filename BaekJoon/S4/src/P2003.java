/*
 * BOJ 2003 수들의 합 2
 *
 * memory : 15076kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2003 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] a = new int[n + 1];
        int[] s = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            s[i] = s[i - 1] + a[i];
        }

        int ans = 0;
        for (int i = 1, j = 1; j <= n; ) {
            int sum = s[j] - s[i - 1];

            if (sum < m)
                j++;
            else if (sum > m)
                i++;
            else {
                ans++;
                j++;
            }
        }

        System.out.print(ans);
    }
}
