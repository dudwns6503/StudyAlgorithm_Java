/*
 * BOJ 14940 쉬운 최단거리
 *
 * memory : 57000kb
 * time : 648ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P14940 {

    private static Queue<Integer> queue;
    private static int[][] dis;
    private static final int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private static int n, m;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        dis = new int[n][m];
        queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                int num = Integer.parseInt(st.nextToken());

                if (num == 2) {
                    queue.offer(i);
                    queue.offer(j);
                    dis[i][j] = 0;
                } else if (num == 1) {
                    dis[i][j] = -1;
                } else {
                    dis[i][j] = 0;
                }
            }
        }
    }

    private static void solve() {
        while (!queue.isEmpty()) {
            int x = queue.poll();
            int y = queue.poll();

            for (int k = 0; k < 4; k++) {
                int nx = x + dir[k][0];
                int ny = y + dir[k][1];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (dis[nx][ny] != -1) continue;

                dis[nx][ny] = dis[x][y] + 1;
                queue.offer(nx);
                queue.offer(ny);
            }
        }

        print();
    }

    private static void print() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(dis[i][j]).append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
