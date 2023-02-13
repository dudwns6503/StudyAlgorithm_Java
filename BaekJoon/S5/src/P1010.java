/*
 * BOJ 1010 다리 놓기
 *
 * memory : 14412kb
 * time : 136ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1010 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringBuilder sb = new StringBuilder();
    private static int[][] dp;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        int t = Integer.parseInt(br.readLine());

        // dp는 반복문 들어가기전에 미리 초기화
        dp = new int[30][30];
        for (int i = 0; i < 30; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;
        }

        for (int i = 2; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i-1][j];
            }
        }

        while (t-- > 0) {
            input();
            solve();
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static void input() throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        /**
         * 조합론에서 두 개의 공식을 적용하여 메모이제이션을 활용한 동적계획법을 쓸 것이다.
         * 1. n+1Cr+1 = nCr + nCr+1
         * 2. nC0 = nCn = 1
         *
         * 문제에서는 m개의 다리 중에서 n개를 선택해야 하므로, mCn이다.
         */
        sb.append(dp[m][n]).append("\n");
    }

}
