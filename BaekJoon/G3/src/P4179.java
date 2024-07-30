/*
 * BOJ 4179 불!
 *
 * memory : 113688kb
 * time : 920ms
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P4179 {

    private static Queue<Node> jihoonQueue, fireQueue;
    private static String[] maze;
    private static int[][] fireSecond,exitSecond;
    private static int[][] dir = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
    private static int r, c, min;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        // 불을 먼저 퍼뜨린다.
        fireSpread();
        // 지훈이를 움직인다.
        jihoonMove();
        // 지훈이의 최소 시간을 구한다.
        SearchEdge();

        if (min == Integer.MAX_VALUE)
            System.out.print("IMPOSSIBLE");
        else
            System.out.print(min);
    }

    private static void fireSpread() {
        while (!fireQueue.isEmpty()) {
            Node node = fireQueue.poll();

            int x = node.x;
            int y = node.y;

            for (int i = 0; i < 4; i++) {
                int nx = x + dir[i][0];
                int ny = y + dir[i][1];

                if (nx < 0 || ny < 0 || nx >= r || ny >= c)
                    continue;

                if (maze[nx].charAt(ny) == '#')
                    continue;

                if (fireSecond[nx][ny] == Integer.MAX_VALUE) {
                    fireSecond[nx][ny] = fireSecond[x][y] + 1;
                    fireQueue.offer(new Node(nx, ny));
                }
                else {
                    if (fireSecond[nx][ny] > (fireSecond[x][y] + 1)) {
                        fireSecond[nx][ny] = fireSecond[x][y] + 1;
                        fireQueue.offer(new Node(nx, ny));
                    }
                }
            }
        }
    }

    private static void jihoonMove() {
        while (!jihoonQueue.isEmpty()) {
            Node node = jihoonQueue.poll();

            int x = node.x;
            int y = node.y;

            for (int i = 0; i < 4; i++) {
                int nx = x + dir[i][0];
                int ny = y + dir[i][1];

                if (nx < 0 || ny < 0 || nx >= r || ny >= c)
                    continue;

                if (maze[nx].charAt(ny) == '#' || maze[nx].charAt(ny) == 'F')
                    continue;

                if (exitSecond[nx][ny] == 0) {
                    exitSecond[nx][ny] = exitSecond[x][y] + 1;
                    jihoonQueue.offer(new Node(nx, ny));
                }
                else {
                    if (exitSecond[nx][ny] > exitSecond[x][y] + 1) {
                        exitSecond[nx][ny] = exitSecond[x][y] + 1;
                        jihoonQueue.offer(new Node(nx, ny));
                    }
                }
            }
        }
    }

    private static void SearchEdge() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 || i == r - 1 || j == 0 || j == c - 1) {
                    if (maze[i].charAt(j) == '#' || maze[i].charAt(j) == 'F')
                        continue;

                    if (maze[i].charAt(j) == 'J') {
                        min = 1;
                        break;
                    }

                    if (exitSecond[i][j] == 0)
                        continue;

                    if (exitSecond[i][j] < fireSecond[i][j])
                        min = Math.min(min, exitSecond[i][j] + 1);
                }
            }
        }

    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        jihoonQueue = new LinkedList<>();
        fireQueue = new LinkedList<>();

        min = Integer.MAX_VALUE;

        fireSecond = new int[r][c];
        exitSecond = new int[r][c];

        for (int i = 0; i < r; i++) {
            Arrays.fill(fireSecond[i], Integer.MAX_VALUE);
        }

        maze = new String[r];
        for (int i = 0; i < r; i++) {
            maze[i] = br.readLine();

            for (int j = 0; j < c; j++) {
                if (maze[i].charAt(j) == 'J') {
                    jihoonQueue.add(new Node(i, j));
                }
                else if (maze[i].charAt(j) == 'F') {
                    fireQueue.add(new Node(i, j));
                    fireSecond[i][j] = 0;
                }
            }
        }
    }


    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
