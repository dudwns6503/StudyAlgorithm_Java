/*
 * BOJ 14328 2xn 타일링
 *
 * memory : 14328kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11726 {

    private static int[] dp;
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
        /**
         * 다이나믹 프로그래밍을 활용하면 시간 내에 풀 수 있는 문제이다.
         *
         * 규칙은 dp[i] = dp[i-1] + dp[i-2]이다.
         *
         * 예를 들어 n = 3일 때, dp[1] + dp[2]라는 뜻인데 타일로 표현해보면
         * dp[1] = 1(2x1 타일 한 개) |
         *                           |
         * dp[2] = 2(2x1 타일 2개, 1x2 타일 2개) | |  - -
         *                                       | |  - -
         * dp[3] = 3(2x1 타일 한개에 1x2 타일 2개) + (2x1 타일 2개에 2x1 타일 1개, 1x2 타일 2개에 2x1 타일 1개)
         *  | - -   | | |  - - |
         *  | - -   | | |  - - |
         *
         *  이렇게 기호로 표시해봤는데 규칙이 보이는가?
         *  | - -  <- 이 것은 dp[1]에 1x2 타일을 뒤에 추가한 모양이고
         *  | - -
         *
         *  | | |  - - |  <- 이 두가지 경우는 dp[2]에 2x1 타일을 뒤에 추가한 모양이다.
         *  | | |  - - |
         *
         *  즉, 2 x (i-2)번째에서 1x2 타일을 추가한 경우 + 2 x (i-1)번째에서 2x1 타일을 추가한 경우
         *  2 x (i-2) = dp[i-2]
         *  2 x (i-1) = dp[i-1] 이므로
         *  dp[i] = dp[i-1] + dp[i-2]이다.
         */
        dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }

        System.out.print(dp[n]);
    }
}
