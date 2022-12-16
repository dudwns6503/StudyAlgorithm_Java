/*
 * BOJ 2468 안전 영역
 *
 * memory : 18692kb
 * time : 248ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2468 {

    static boolean[][] visited;
    static int[][] area;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        area = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int input = Integer.parseInt(st.nextToken());
                area[i][j] = input;
            }
        }
    }

    private static void solve() {
        int max = Integer.MIN_VALUE;;
        int count = 0;

        for (int height = 0; height <= 100; height++) {
            visited = new boolean[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j] && area[i][j] > height) {
                        dfs(i, j, height);
                        count++;
                    }
                }
            }

            max = Math.max(max, count);
            if (count == 0) break; // 이 부분은 없어도 되지만.. 빨리 반복문을 끝낼 수 있음.
            count = 0;
        }

        System.out.print(max);
    }

    private static void dfs(int x, int y, int height) {
        visited[x][y] = true;

        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
            if (visited[nx][ny]) continue;

            // 다음 영역이 방문한 적이 없고, 물의 높이보다 높다면 dfs를 진행.
            if (area[nx][ny] > height) {
                dfs(nx, ny, height);
            }
        }
    }
}
