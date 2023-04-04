/*
 * BOJ 13458 시험 감독
 *
 * memory : 92216kb
 * time : 480ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P13458 {

    private static int[] a;
    private static int n, b, c;

    public static void main(String[] args) throws Exception {
        input();
        solve();
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

        st = new StringTokenizer(br.readLine());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        long ans = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] -= b;
            ans++;

            while (a[i] > 0) {
                if (a[i] <= c) {
                    ans++;
                    break;
                } else {
                    ans += a[i] / c;
                    a[i] %= c;
                }
            }
        }

        System.out.print(ans);
    }
}
