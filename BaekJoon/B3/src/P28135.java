/*
 * BOJ 28135 Since 1973
 *
 * memory : 46716kb
 * time : 236ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P28135 {

    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
    }

    private static void solve() {
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            String str = String.valueOf(i);

            if (str.contains("50")) {
                ans++;
            }

            ans++;
        }

        if (String.valueOf(n).contains("50")) {
            ans--;
        }

        System.out.print(ans);
    }
}
