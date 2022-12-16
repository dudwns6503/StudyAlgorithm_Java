/*
 * BOJ 14503 로봇 청소기
 *
 * memory : 14364kb
 * time : 136ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14503 {

    static int[][] area;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int n, m, r, c, d, count;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        /**
         * 0: 북
         * 1: 동
         * 2: 남
         * 3: 서
         */
        d = Integer.parseInt(st.nextToken());

        area = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int input = Integer.parseInt(st.nextToken());
                area[i][j] = input;
            }
        }
    }

    private static void solve() {
        count = 1;
        // 현재 위치에서 시작
        dfs(r, c, d);
        System.out.print(count);
    }

    private static void dfs(int x, int y, int direction) {

        // 현재 칸이 아직 청소되지 않은 경우, 현재 칸을 청소한다.
        area[x][y] = -1;

        for (int i = 0; i < 4; i++) {
            // 반시계 방향으로 90도 회전한다.
            direction = (direction + 3) % 4;

            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (nx >= 0 && nx < n && ny >= 0 && ny < m && area[nx][ny] == 0) {
                // 바라보는 방향을 기준으로 앞쪽 칸이 청소되지 않은 빈 칸인 경우 한 칸 전진한다.
                // 1번으로 돌아간다.
                count++;
                dfs(nx, ny, direction);

                return;
            }
        }

        // 네 방향 모두 청소가 이미 되었거나 벽인 경우에는
        // 뒤쪽 칸이 벽이 아니라면 바라보는 방향을 유지한 채로 한 칸 후진.
        int back = (direction + 2) % 4;
        int nx = x + dx[back];
        int ny = y + dy[back];

        if (nx >= 0 && nx < n && ny >= 0 && ny < m && area[nx][ny] != 1) {
            dfs(nx, ny, direction);
        }
    }
}
