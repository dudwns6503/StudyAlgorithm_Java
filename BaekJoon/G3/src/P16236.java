/*
 * BOJ 16236 아기 상어
 *
 * memory : 21896kb
 * time : 180ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P16236 {

    private static int[][] aquarium;
    private static int[][] dist;
    private static int[][] dir = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
    private static int n, startX, startY, curX, curY, sharkSize = 2, eatFish = 0, time = 0, minDist;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        aquarium = new int[n][n];
        dist = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                aquarium[i][j] = Integer.parseInt(st.nextToken());

                if (aquarium[i][j] == 9) {
                    startX = i;
                    startY = j;
                    aquarium[i][j] = 0;
                }
            }
        }
    }

    private static void solve() {
        while (true) {
            dist = new int[n][n];
            curX = Integer.MAX_VALUE;
            curY = Integer.MAX_VALUE;
            minDist = Integer.MAX_VALUE;
            findFish(startX, startY);

            if (curX != Integer.MAX_VALUE && curY != Integer.MAX_VALUE) {
                eatFish++;
                aquarium[curX][curY] = 0;
                startX = curX;
                startY = curY;
                time += dist[curX][curY];

                if (eatFish == sharkSize) {
                    sharkSize++;
                    eatFish = 0;
                }
            } else {
                break;
            }
        }

        System.out.print(time);
    }

    private static void findFish(int x, int y) {
        Queue<Node> queue = new LinkedList<>();

        queue.offer(new Node(x, y));
        dist[x][y] = 0;

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            for (int k = 0; k < 4; k++) {
                int nx = node.x + dir[k][0];
                int ny = node.y + dir[k][1];

                // 이동할 수 없는 경우 체크
                if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                if (dist[nx][ny] != 0) continue;
                if (aquarium[nx][ny] > sharkSize) continue;

                dist[nx][ny] = dist[node.x][node.y] + 1;

                // 먹을 수 있다면
                if (aquarium[nx][ny] != 0 && aquarium[nx][ny] < sharkSize) {
                    if (minDist > dist[nx][ny]) {
                        minDist = dist[nx][ny];
                        curX = nx;
                        curY = ny;
                        // 거리가 같을 경우 좌표 비교(더 위에 있거나, 같은 x라면 더 왼쪽에 있는 것을 Queue에 넣음)
                    } else if (minDist == dist[nx][ny]) {
                        if (curX == nx) {
                            if (curY > ny) {
                                curX = nx;
                                curY = ny;
                            }
                        } else if (curX > nx) {
                            curX = nx;
                            curY = ny;
                        }
                    }
                }

                queue.offer(new Node(nx, ny));
            }
        }
    }


    static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
