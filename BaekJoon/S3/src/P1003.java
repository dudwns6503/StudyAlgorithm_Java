/*
 * BOJ 1003 피보나치 함수
 *
 * memory : 14152kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1003 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringBuilder sb = new StringBuilder();
    private static int[][] dp;
    private static int n;

    public static void main(String[] args) throws Exception {
        /**
         *  피보나치 문제는 웬만하면 다이나믹 프로그래밍을 활용하는 문제이다. (시간 초과 컷이 많이 나옴)
         *  규칙만 찾으면 쉽게 풀 수 있는 문제이다.
         *
         *  일반적으로 피보나치를 구하는 것이 아닌 0과 1이 호출되는 횟수를 출력하는 것이므로
         *  2차원 배열을 사용하였다.
         *  [n][0] -> fibonacci(n)일 때 0이 호출된 횟수
         *  [n][1] -> fibonacci(n)일 때 1이 호출된 횟수
         *
         *  대부분의 피보나치는 0과 1은 초깃값으로 미리 넣어둔다.
         *  dp[0][0] = 1; dp[0][1] = 0; // fibonacci(0)은 0이 1번, 1은 0번 호출
         *  dp[1][0] = 0; dp[1][1] = 1; // fibonacci(1)은 0은 0번, 1은 1번 호출
         *
         *  피보나치 2는 피보나치 1과 피보나치 0을 호출한다.
         *  간략하게 표현하면 아래처럼 표현할 수 있는데
         *
         *  dp[2] = dp[0] + dp[1];
         *  이는 아래와 같이 표현될 수도 있다.
         *  dp[2][0] = dp[0][0] + dp[1][0]; // 1 // fibonacci(2)은 0이 1번 호출
         *  dp[2][1] = dp[0][1] + dp[1][1]; // 1 // fibonacci(2)은 1이 1번 호출
         *
         *  dp[3] = dp[2] + dp[1] = dp[1] + dp[1] + dp[0];
         *  dp[3][0] = dp[1][0] + dp[2][0]; // 1 // fibonacci(3)은 0이 1번 호출
         *  dp[3][1] = dp[1][1] + dp[2][1]; // 2 // fibonacci(3)은 1이 2번 호출
         *
         *  이와 같은 방식으로 해결해 나가면 n이 주어졌을 때 답은
         *  dp[i][0]과 dp[i][1]이다.
         *
         *  실제 테스트케이스를 반복해서 들어가기 전에 dp 배열의 값을 모두 채워주었다.
         *  이유는 테스트케이스를 여러번 반복해도 피보나치 함수의 값 자체는 바뀌지 않기 때문이다.
         */
        int t = Integer.parseInt(br.readLine());

        dp = new int[41][2];
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            sb.append(dp[n][0]).append(" ").append(dp[n][1]).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
