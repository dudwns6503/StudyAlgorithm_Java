/*
 * BOJ 2579 계단 오르기
 *
 * memory : 14244kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2579 {

    private static int[][] dp;
    private static int[] scores;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        dp = new int[n + 1][2];
        scores = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }
    }

    private static void solve() {
        /**
         * dp[i][0]는 전 칸을 밟지 않고 i번째 계단에 왔을 때 얻을 수 있는 최대 점수
         * dp[i][1]는 전 칸을 밟고 i번째 계단에 왔을 때 얻을 수 있는 최대 점수
         *
         * 마지막 칸을 기준으로 생각해보자. 마지막 칸으로 올 수 있는 경우는
         * 1. 1칸을 뛰어서 마지막 칸으로 온 경우
         * 2. 2칸을 뛰어서 마지막 칸으로 오는 경우로 나눌 수 있다.
         *
         *  마지막 칸을 i, 이 전 칸을 i-1로 표현해보겠다.
         *
         * 1의 경우로 왔다면 i-1 -> i 로 온 경우이다.
         *  만약 i-2을 밟았다면 세 칸을 연속으로 밟은 경우(i-2 -> i-1 -> i)가 되므로 규칙에 위배된다.
         *  따라서, i-2칸을 밟지 않았다는 경우만 생각해야 한다.
         *
         *  i-1을 밟고 온 것이므로 dp[i][1]에 값을 넣어주어야 한다.
         *  dp[i][1] = dp[i-1][0] + scores[i]
         *
         * 2의 경우로 왔다면 i-2 -> i 로 온 경우이다.
         *  i-2칸에 도착했을 때를 생각해야 한다.
         *  연속(i-3 -> i-2)으로 왔거나, 이 전 칸도 2칸(i-4 -> i-2)을 뛰고 왔을 경우가 있다.
         *  이 두가지 경우를 비교해서 최댓값을 넣어주어야 한다.
         *
         *  i-1을 밟지 않고 온 것이므로 dp[i][0]에 넣어줘야한다.
         *  dp[i][0] = Math.max(dp[i-2][0] + scores[i], dp[i-2][1] + scores[i])
         */

        dp[1][0] = scores[1];
        // dp[1][1]은 없는 경우이다, 0번째 칸은 밟을 수 없으므로..

        for (int i = 2; i <= n; i++) {
            dp[i][0] = Math.max(dp[i - 2][0] + scores[i], dp[i-2][1] + scores[i]);
            dp[i][1] = dp[i - 1][0] + scores[i];
        }

        System.out.print(Math.max(dp[n][0], dp[n][1]));
    }
}
