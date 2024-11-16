/*
 * BOJ 1743 음식물 피하기
 *
 * memory : 16328kb
 * time : 140ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1743 {

    private static int[][] map;
    private static boolean[][] visited;
    private static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private static int n, m, k, cnt;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    cnt = 1;
                    dfs(i, j);
                }

            }
        }

        int max = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                max = Math.max(max, map[i][j]);
            }
        }

        System.out.print(max);
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        map[x][y] = cnt;

        for (int k = 0; k < 4; k++) {
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];

            if (nx <= 0 || ny <= 0 || nx > n || ny > m)
                continue;

            if (visited[nx][ny] || map[nx][ny] == 0)
                continue;

            cnt++;
            dfs(nx, ny);
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        // 좌표가 1부터 시작하므로 + 1의 배열을 선언
        map = new int[n + 1][m + 1];
        visited = new boolean[n + 1][m + 1];

        // 음식물은 1로 표시
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            map[x][y] = 1;
        }
    }
}
