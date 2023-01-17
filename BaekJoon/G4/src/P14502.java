/*
 * BOJ 14502 연구소
 *
 * memory : 306540kb
 * time : 1352ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P14502 {

    private static int[][] map;
    private static int[][] dir = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    private static boolean[][] visited;
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

        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static void solve() {
        makeWall(0);
        System.out.print(ans);
    }

    private static void makeWall(int cnt) {
        if (cnt == 3) {
            /**
             * 1. 벽을 세개 다 세웠다면 visited를 초기화하고,
             * 2. 벽을 세운 맵을 복사한 맵을 만들어준다.
             */
            visited = new boolean[n][m];
            int[][] copyMap = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    copyMap[i][j] = map[i][j];
                }
            }

            // 벽을 다 세웠다면 바이러스를 퍼뜨린다.
            spreadVirus(copyMap);

            // 바이러스를 퍼뜨린 후 안전 영역을 계산.
            countSafeArea(copyMap);
            return;
        }

        // 재귀적으로 빈 칸에 벽을 세운다.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    map[i][j] = 1;
                    makeWall(cnt + 1);
                    map[i][j] = 0;
                }
            }
        }
    }

    private static void spreadVirus(int[][] map) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 2) {
                    queue.offer(i);
                    queue.offer(j);
                    visited[i][j] = true;
                }
            }
        }

        while (!queue.isEmpty()) {
            int x = queue.poll();
            int y = queue.poll();

            for (int k = 0; k < 4; k++) {
                int nx = x + dir[k][0];
                int ny = y + dir[k][1];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (visited[nx][ny]) continue;
                if (map[nx][ny] != 0) continue;

                map[nx][ny] = 2;
                queue.offer(nx);
                queue.offer(ny);
                visited[nx][ny] = true;
            }
        }
    }

    private static void countSafeArea(int[][] map) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) sum++;
            }
        }

        ans = Math.max(ans, sum);
    }
}
