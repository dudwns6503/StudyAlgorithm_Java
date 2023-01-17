/*
 * BOJ 3055 탈출
 *
 * memory : 14256kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P3055 {

    private static String[] map;
    private static int[][] dist_water;
    private static int[][] dist_hedgehog;
    private static int[][] dir = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    private static int r, c;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        map = new String[r];
        dist_water = new int[r][c];
        dist_hedgehog = new int[r][c];

        for (int i = 0; i < r; i++) {
            map[i] = br.readLine();
        }
    }

    private static void solve() {
        // 물에 대하여 BFS
        bfs_water();

        // 고슴도치에 대하여 BFS
        bfs_hedgehog();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (map[i].charAt(j) == 'D') {
                    if (dist_hedgehog[i][j] == -1) System.out.print("KAKTUS");
                    else System.out.print(dist_hedgehog[i][j]);
                }
            }
        }
    }

    private static void bfs_water() {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                dist_water[i][j] = -1;

                if (map[i].charAt(j) == '*') {
                    queue.offer(i);
                    queue.offer(j);
                    dist_water[i][j] = 0;
                }
            }
        }

        while (!queue.isEmpty()) {
            int x = queue.poll();
            int y = queue.poll();

            for (int k = 0; k < 4; k++) {
                int nx = x + dir[k][0];
                int ny = y + dir[k][1];

                if (nx < 0 || ny < 0 || nx >= r || ny >= c) continue;
                if (dist_water[nx][ny] != -1) continue;
                if (map[nx].charAt(ny) != '.') continue;

                dist_water[nx][ny] = dist_water[x][y] + 1;
                queue.offer(nx);
                queue.offer(ny);
            }
        }
    }

    private static void bfs_hedgehog() {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                dist_hedgehog[i][j] = -1;

                if (map[i].charAt(j) == 'S') {
                    queue.offer(i);
                    queue.offer(j);
                    dist_hedgehog[i][j] = 0;
                }
            }
        }

        while (!queue.isEmpty()) {
            int x = queue.poll();
            int y = queue.poll();

            for (int k = 0; k < 4; k++) {
                int nx = x + dir[k][0];
                int ny = y + dir[k][1];

                if (nx < 0 || ny < 0 || nx >= r || ny >= c) continue;
                if (map[nx].charAt(ny) == '*' || map[nx].charAt(ny) == 'X') continue;
                if (dist_water[nx][ny] != -1 && dist_water[nx][ny] <= dist_hedgehog[x][y] + 1) continue;
                if (dist_hedgehog[nx][ny] != -1) continue;

                dist_hedgehog[nx][ny] = dist_hedgehog[x][y] + 1;
                queue.offer(nx);
                queue.offer(ny);
            }
        }
    }
}
