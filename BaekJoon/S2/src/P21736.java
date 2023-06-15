/*
 * BOJ 21736 헌내기는 친구가 필요해
 *
 * memory : 46092kb
 * time : 424ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P21736 {

    private static Queue<Integer> queue = new LinkedList<>();
    private static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private static boolean[][] visited;
    private static String[] campus;
    private static int n, m, ans;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        campus = new String[n];
        visited = new boolean[n][m];
        ans = 0;

        for (int i = 0; i < n; i++) {
            campus[i] = br.readLine();

            for (int j = 0; j < campus[i].length(); j++) {
                if (campus[i].charAt(j) == 'I') {
                    queue.offer(i);
                    queue.offer(j);
                    visited[i][j] = true;
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
                if (campus[nx].charAt(ny) == 'X') continue;
                if (visited[nx][ny]) continue;

                if (campus[nx].charAt(ny) == 'P') ans++;

                visited[nx][ny] = true;
                queue.offer(nx);
                queue.offer(ny);
            }
        }

        if (ans == 0) {
            System.out.print("TT");
        } else {
            System.out.print(ans);
        }
    }
}
