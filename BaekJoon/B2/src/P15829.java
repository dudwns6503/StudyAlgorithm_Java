/*
 * BOJ 15829 Hashing
 *
 * memory : 14192kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P15829 {

    private static long[] a;
    private static int l;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        l = Integer.parseInt(br.readLine());

        a = new long[l];

        String str = br.readLine();

        for (int i = 0; i < l; i++) {
            char ch = str.charAt(i);
            a[i] = ch - 'a' + 1;
        }
    }

    private static void solve() {
        final long M = 1234567891;

        long sum = 0;
        long pow = 1;

        for (int i = 0; i < l; i++) {
            sum += a[i] * pow % M;
            pow = pow * 31 % M;
        }

        long ans = sum % M;
        System.out.print(ans);
    }
}
