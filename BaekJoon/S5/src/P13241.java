 /*
  * BOJ 13241 최소공배수
  *
  * memory : 14208kb
  * time : 124ms
  */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P13241 {

    private static long a, b;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
    }

    private static void solve() {
        long ans = 0L;

        long gcd = get_gcd(Math.max(a, b), Math.min(a, b));

        ans = a * b / gcd;
        System.out.print(ans);
    }

    private static long get_gcd(long a, long b) {
        if (b == 0) return a;
        return get_gcd(b, a % b);
    }
}
