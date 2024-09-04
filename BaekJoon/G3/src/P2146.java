/*
 * BOJ 2146 다리 만들기
 *
 * memory : 33688kb
 * time : 292ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2146 {

    private static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private static int[][] map;
    private static boolean[][] visited;
    private static int[][] dist;
    private static int n, min, cnt;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    /**
     * 1. dfs를 통해서 섬을 구분한다.(다다음에 발견한 육지가 현재 섬의 육지인지 다른 섬의 육지인지 현재는 구분할 수 없다.)
     * 2. bfs를 통해서 최단 거리를 탐색한다.
     * 3. 최단 거리를 탐색할 때 다다음의 위치가 출발했던 섬과 숫자가 다르다면 다리를 이어준다.(같은 섬은 다리를 이으면 안된다.)
     */
    private static void solve() {
        // 0은 바다 1은 육지
        cnt = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 한 섬의 육지는 0과 1이 아닌 같은 숫자로 통일 시킨다.
                if (!visited[i][j] && map[i][j] == 1) {
                    dfs(i, j);
                    cnt++;
                }
            }
        }

        // 현재 섬의 번호를 cnt에 담고, bfs를 실행한다.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] != 0) {
                    cnt = map[i][j];

                    bfs(i, j);
                }
            }
        }

        System.out.print(min);
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        map[x][y] = cnt;

        for (int k = 0; k < 4; k++) {
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];

            if (nx < 0 || ny < 0 || nx >= n || ny >= n)
                continue;

            if (visited[nx][ny])
                continue;

            if (map[nx][ny] == 0)
                continue;

            dfs(nx, ny);
        }
    }

    private static void bfs(int i, int j) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);
        queue.offer(j);
        dist[i][j] = 0;

        while (!queue.isEmpty()) {
            int x = queue.poll();
            int y = queue.poll();

            for (int k = 0; k < 4; k++) {
                int nx = x + dir[k][0];
                int ny = y + dir[k][1];

                if (nx < 0 || ny < 0 || nx >= n || ny >= n)
                    continue;

                // 바다가 아니라면 continue
                if (map[nx][ny] != 0)
                    continue;

                // 다음 위치(nx, ny)로 가는 거리가 최솟값이라면 거리를 갱신하고, 다다음 위치(nnx, nny)를
                // 사방탐색을 미리해서 그 자리에 다른 섬이 있다면 그 값을 최솟값으로 갱신
                if (dist[nx][ny] > dist[x][y] + 1) {
                    dist[nx][ny] = dist[x][y] + 1;

                    for (int l = 0; l < 4; l++) {
                        int nnx = nx + dir[l][0];
                        int nny = ny + dir[l][1];

                        if (nnx < 0 || nny < 0 || nnx >= n || nny >= n)
                            continue;

                        // 바다가 아니면서 다른 섬이라면 min 값 갱신
                        if (map[nnx][nny] != 0 && map[nnx][nny] != cnt) {
                            min = Math.min(min, dist[nx][ny]);
                            break;
                        }
                    }

                    queue.offer(nx);
                    queue.offer(ny);
                }
            }
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        dist = new int[n][n];
        visited = new boolean[n][n];
        min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
