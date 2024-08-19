/*
 * BOJ 1850 최대공약수
 *
 * memory : 38708kb
 * time : 252ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1850 {

    private static long a, b;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        long max = Math.max(a, b);
        long min = Math.min(a, b);

        long gcd = gcd(max, min);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < gcd; i++) {
            sb.append(1);
        }

        System.out.print(sb);
    }

    private static long gcd(long a, long b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
    }

}
