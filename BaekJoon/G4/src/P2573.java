/*
 * BOJ 2573 빙산
 *
 * memory : 47500kb
 * time : 496ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2573 {

    private static int[][] map;
    private static int[][] newMap;
    private static int[][] dir = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    private static boolean[][] visited;
    private static boolean flag = false;
    private static int n, m, section, year = 0;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        newMap = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                newMap[i][j] = map[i][j];
            }
        }
    }

    private static void solve() {
        while (true) {
            sectionCheck();

            // 전부 다 녹았지만 결과가 안나온 경우
            if (!flag) {
                year = 0;
                break;
            }

            // 빙산이 2덩어리 이상 분리되었다면 종료한다.
            if (section >= 2) {
                break;
            }

            year++;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (map[i][j] != 0) {
                        heightDown(i, j);
                    }
                }
            }

            copyMap();
        }

        System.out.print(year);
    }

    private static void sectionCheck() {
        section = 0;
        visited = new boolean[n][m];

        flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] != 0) {
                    flag = true;

                    if (!visited[i][j]) {
                        section++;
                        dfs(i, j);
                    }
                }
            }
        }
    }

    private static void dfs(int x, int y) {
        for (int k = 0; k < 4; k++) {
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];

            if (nx < 0 || nx >= n || ny < 0 || ny >= m || visited[nx][ny] || map[nx][ny] == 0) continue;
            visited[nx][ny] = true;
            dfs(nx, ny);
        }
    }

    private static void heightDown(int x, int y) {
        for (int k = 0; k < 4; k++) {
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];

            if (nx < 0 || ny < 0 || nx >= n || ny >= m || map[nx][ny] != 0) continue;
            if (newMap[x][y] > 0) newMap[x][y]--;
        }
    }

    private static void copyMap() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = newMap[i][j];
            }
        }
    }
}
