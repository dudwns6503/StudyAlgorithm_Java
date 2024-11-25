/*
 * BOJ 14945 불장난
 *
 * memory : 20428kb
 * time : 168ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P14945 {

    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int[][][] dp = new int[n][n][n];

        int MOD = 10007;
        // 1번째 줄에 두 사람은 서로 다른 타일에 위치해야 한다.
        dp[1][0][1] = 1;

        // i: 현재 줄의 번호
        // j: 기웅의 위치
        // k: 민수의 위치
        // (아래, 아래), (아래, 대각), (대각, 아래), (대각, 대각)
        // dp[i][j][k] = dp[i - 1][j][k] + dp[i - 1][j][k - 1] + dp[i - 1][j - 1][k] + dp[i - 1][j - 1][k - 1]
        for (int i = 2; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // 인덱스를 벗어나면 예외 발생한다.
                    if (j < n && k < n) dp[i][j][k] = (dp[i][j][k] + dp[i-1][j][k]) % MOD;
                    if (j < n && k-1 >= 0) dp[i][j][k] = (dp[i][j][k] + dp[i-1][j][k-1]) % MOD;
                    if (j-1 >= 0 && k < n) dp[i][j][k] = (dp[i][j][k] + dp[i-1][j-1][k]) % MOD;
                    if (j-1 >= 0 && k-1 >= 0) dp[i][j][k] = (dp[i][j][k] + dp[i-1][j-1][k-1]) % MOD;
                }
            }
        }

        int result = 0;
        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                result = (result + dp[n-1][j][k]) % MOD;
            }
        }

        result = (result * 2) % MOD;
        System.out.print(result);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
    }
}
