/*
 * BOJ 25191 치킨댄스를 추는 곰곰이를 본 임스
 *
 * memory : 14164kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25191 {

    private static int n, a, b;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        int ans = 0;

        if (n - b <= 0) {
            ans = Math.min(n, b);
        } else {
            ans += b;
            n -= b;

            if (n >= 0 && a >= 2) {
                ans += Math.min(n, a / 2);
            }
        }

        System.out.print(ans);
    }
}
