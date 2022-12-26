/*
 * BOJ 7569 토마토
 *
 * memory : 123592kb
 * time : 764ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P7569 {

    static int[][][] boxes;
    static int[][][] dist;
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    static int m, n, h, ans;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        boxes = new int[h][n][m];
        dist = new int[h][n][m];

        for (int k = 0; k < h; k++) {
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < m; j++) {
                    dist[k][i][j] = -1;
                    boxes[k][i][j] = Integer.parseInt(st.nextToken());
                }
            }
        }
    }

    private static void solve() {
        Queue<Tomato> queue = new LinkedList<>();

        for (int k = 0; k < h; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (boxes[k][i][j] == 1) {
                        queue.offer(new Tomato(k, i, j));
                        dist[k][i][j] = 0;
                    }
                }
            }
        }

        while (!queue.isEmpty()) {
            Tomato tomato = queue.poll();

            int z = tomato.z;
            int x = tomato.x;
            int y = tomato.y;

            for (int k = 0; k < 6; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                int nz = z + dz[k];

                if (nx < 0 || ny < 0 || nz < 0 || nx >= n || ny >= m || nz >= h) continue;
                if (boxes[nz][nx][ny] == 1 || boxes[nz][nx][ny] == -1) continue;
                if (dist[nz][nx][ny] != -1) continue;

                boxes[nz][nx][ny] = 1;
                queue.offer(new Tomato(nz, nx, ny));
                dist[nz][nx][ny] = dist[z][x][y] + 1;
            }
        }

        if (!isAllCooked()) {
            System.out.print("-1");
        }
        else {
            for (int k = 0; k < h; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (dist[k][i][j] != -1) {
                            ans = Math.max(ans, dist[k][i][j]);
                        }
                    }
                }
            }
            System.out.print(ans);
        }
    }

    private static boolean isAllCooked() {
        for (int k = 0; k < h; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (boxes[k][i][j] == 0) return false;
                }
            }
        }
        return true;
    }

    static class Tomato {
        int z, x, y;

        public Tomato(int z, int x, int y) {
            this.z = z;
            this.x = x;
            this.y = y;
        }
    }
}
