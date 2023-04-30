/*
 * BOJ 14500 테트로미노
 *
 * memory : 31860kb
 * time : 636ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14500 {

    private static boolean[][] visited;
    private static int[][] paper;
    private static int[][] dir = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    private static int n, m, ans = Integer.MIN_VALUE;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        paper = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static void solve() {
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                visited[i][j] = true;
                dfs(i, j, 1, paper[i][j]);
                visited[i][j] = false;
                check(i, j);
            }
        }

        System.out.print(ans);
    }

    // ㅏ, ㅜ, ㅓ, ㅗ 모양 체크
    private static void check(int x, int y) {
        if (x + 2 < n && y + 1 < m) {
            int sum = 0;
            sum += paper[x][y];
            sum += paper[x + 1][y];
            sum += paper[x + 1][y + 1];
            sum += paper[x + 2][y];
            ans = Math.max(ans, sum);

        }

        if (x + 1 < n && y + 2 < m) {
            int sum = 0;
            sum += paper[x][y];
            sum += paper[x][y + 1];
            sum += paper[x + 1][y + 1];
            sum += paper[x][y + 2];
            ans = Math.max(ans, sum);
        }

        if (x + 2 < n && y - 1 >= 0) {
            int sum = 0;
            sum += paper[x][y];
            sum += paper[x + 1][y];
            sum += paper[x + 1][y - 1];
            sum += paper[x + 2][y];
            ans = Math.max(ans, sum);
        }

        if (x + 1 < n && y - 1 >= 0 && y + 1 < m) {
            int sum = 0;
            sum += paper[x][y];
            sum += paper[x + 1][y];
            sum += paper[x + 1][y - 1];
            sum += paper[x + 1][y + 1];
            ans = Math.max(ans, sum);
        }
    }

    private static void dfs(int x, int y, int cnt, int sum) {
        if (cnt == 4) {
            ans = Math.max(ans, sum);
            return;
        }

        for (int k = 0; k < 4; k++) {
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];

            if (nx < 0 || ny < 0 || nx >= n || ny >= m || visited[nx][ny]) continue;

            visited[nx][ny] = true;
            dfs(nx, ny, cnt + 1, sum + paper[nx][ny]);
            visited[nx][ny] = false;
        }
    }

}
