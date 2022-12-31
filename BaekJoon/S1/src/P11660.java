/*
 * BOJ 11660 구간 합 구하기 5
 *
 * memory : 123484kb
 * time : 1424ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11660 {

    private static StringBuilder sb = new StringBuilder();
    private static int[][] sum;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] area = new int[n + 1][n + 1];
        sum = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                area[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1) {
                    sum[i][j] = sum[i - 1][n] + area[i][j];
                } else {
                    sum[i][j] = sum[i][j - 1] + area[i][j];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            solve(x1, y1, x2, y2);
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static void solve(int x1, int y1, int x2, int y2) {
        int ans = 0;

        for (; x1 <= x2; x1++) {
            if (y1 == 1) {
                ans += sum[x1][y2] - sum[x1 - 1][n];
            }
            else {
                ans += sum[x1][y2] - sum[x1][y1 - 1];
            }
        }

        sb.append(ans).append("\n");
    }
}
