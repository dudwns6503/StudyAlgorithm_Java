/*
 * BOJ 2167 2차원 배열의 합
 *
 * memory : 27548kb
 * time : 300ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2167 {

    private static StringBuilder sb = new StringBuilder();
    // 각 row별로 sum을 저장해야겠다.
    private static int[][] sum;
    private static int[][] arr;
    private static int n, m;
    private static int k, x, y;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void solve(int i, int j, int x, int y) {
        int ans = 0;

        if (i == x && j == y) {
            ans = arr[i][j];
        } else if (j == y) {
            for (int start = i; start <= x; start++) {
                ans += arr[start][j];
            }
        } else if (i == x) {
            ans = sum[x][y] - sum[i][j - 1];
        } else {
            for (int start = i; start <= x; start++) {
                ans += sum[start][y] - sum[start][j - 1];
            }
        }

        sb.append(ans).append("\n");
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        sum = new int[n + 1][m + 1];
        arr = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                sum[i][j] = sum[i][j - 1] + arr[i][j];
            }
        }

        k = Integer.parseInt(br.readLine());
        for (int cnt = 0; cnt < k; cnt++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            solve(i, j, x, y);
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
