/*
 * BOJ 1926 그림
 *
 * memory : 52864kb
 * time : 456ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P1926 {

    private static int[][] board;
    private static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private static boolean[][] visited;
    private static int n, m, size;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static void solve() {
        ArrayList<Integer> arr = new ArrayList<>();

        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 1 && !visited[i][j]) {
                    size = 0;
                    dfs(i, j);
                    arr.add(size);
                }
            }
        }

        Collections.sort(arr);

        System.out.println(arr.size());

        if (arr.size() != 0) System.out.print(arr.get(arr.size() - 1));
        else System.out.print(0);
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        size++;

        for (int k = 0; k < 4; k++) {
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];

            if (nx < 0 || ny < 0 || nx >= n || ny >= m || board[nx][ny] == 0 || visited[nx][ny]) continue;

            dfs(nx, ny);
        }
    }
}
