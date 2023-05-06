 /*
  * BOJ 9655 돌 게임
  *
  * memory : 14244kb
  * time : 132ms
  */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P9655 {

    private static int[] dp;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        dp = new int[n + 1];
    }

    private static void solve() {
        for (int i = 1; i <= n; i++) {
            if (dp[i - 1] + 3 < n) dp[i] = dp[i - 1] + 3;
            else dp[i] = dp[i - 1] + 1;

            if (dp[i] == n) {
                if (i % 2 == 1) System.out.print("SK");
                else System.out.print("CY");
                break;
            }
        }
    }
}
