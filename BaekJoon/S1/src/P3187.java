/*
 * BOJ 3187 양치기 꿍
 *
 * memory : 20864kb
 * time : 232ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P3187 {

    private static boolean[][] visited;
    private static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private static String[] map;
    private static int r, c, totalSheepCnt, totalWolfCnt, currentSheepCnt, currentWolfCnt;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (map[i].charAt(j) == '#')
                    continue;

                if (!visited[i][j]) {
                    currentSheepCnt = 0;
                    currentWolfCnt = 0;
                    bfs(i, j);
                    if (currentSheepCnt > currentWolfCnt) {
                        totalWolfCnt -= currentWolfCnt;
                    }
                    else {
                        totalSheepCnt -= currentSheepCnt;
                    }
                }
            }
        }

        System.out.print(totalSheepCnt + " " + totalWolfCnt);
    }

    private static void bfs(int currentRow, int currentColumn) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(currentRow);
        queue.offer(currentColumn);
        visited[currentRow][currentColumn] = true;

        while (!queue.isEmpty()) {
            int x = queue.poll();
            int y = queue.poll();

            if (map[x].charAt(y) == 'v')
                currentWolfCnt++;
            else if (map[x].charAt(y) == 'k')
                currentSheepCnt++;

            for (int k = 0; k < 4; k++) {
                int nx = x + dir[k][0];
                int ny = y + dir[k][1];

                if (nx < 0 || ny < 0 || nx >= r || ny >= c)
                    continue;

                if (visited[nx][ny])
                    continue;

                if (map[nx].charAt(ny) == '#')
                    continue;

                queue.offer(nx);
                queue.offer(ny);
                visited[nx][ny] = true;
            }
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        visited = new boolean[r][c];
        map = new String[r];

        totalSheepCnt = 0;
        totalWolfCnt = 0;

        for (int i = 0; i < r; i++) {
            map[i] = br.readLine();

            for (int j = 0; j < c; j++) {
                if (map[i].charAt(j) == 'v')
                    totalWolfCnt++;
                else if (map[i].charAt(j) == 'k')
                    totalSheepCnt++;
            }
        }
    }
}
