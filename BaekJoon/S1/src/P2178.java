/*
 * BOJ 2178 미로 탐색
 */

import java.io.*;
import java.util.*;

public class P2178 {

    // 맵의 좌표를 나타내는 Node 클래스 선언 -> 이후에 queue에 들어감.
    static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    /*
     * maze : 미로를 나타내는 2차원 int형 배열
     * shortDistance : 미로에서 (0,0)에서 해당 좌표로 가는 경로의 최소길이를 가지고 있는 2차원 정수형 배열
     * dx, dy : 상, 하, 좌, 우 사방 탐색을 할 수 있게하는 1차원 int형 배열
     * N : 세로 길이
     * M : 가로 길이
     */
    static int[][] maze;
    static int[][] shortDistance;
    // 상, 하, 좌, 우
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N, M;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new int[N][M];
        shortDistance = new int[N][M];

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<M; j++) {
                // 띄어지지 않은 정수 입력을 받는 테크닉
                maze[i][j] = str.charAt(j) - '0';

                // 최솟값을 출력하기 위해서 최댓값으로 배열을 초기화시킨다.
                shortDistance[i][j] = Integer.MAX_VALUE;
            }
        }

        /*
         *  문제에서 시작지점은(1, 1)이지만 배열에서의 인덱스는(0, 0)이고,
         *  문제에서 시작지점부터 거리는 1로 계산되므로, shortDistance[0][0]에 1을 집어 넣어도 된다.
         *  출력은 도착지점인(N, M) 배열에서는 shortDistance[N-1][M-1]을 출력하면 된다.
         */
        shortDistance[0][0] = maze[0][0];

        bfs();

        System.out.println(shortDistance[N-1][M-1]);
    }

    // 출발지부터 bfs를 하므로 Queue에 (0,0) 노드를 집어 넣는다.
    private static void bfs() {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(0, 0));

        while(!q.isEmpty()) {
            Node node = q.poll();

            int x = node.x;
            int y = node.y;

            // 상,하,좌,우 순으로 사방탐색을 실시한다.
            for(int d=0; d<4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                // 범위를 벗어나거나, 이동할 수 없는 칸이라면 continue
                if(nx < 0 || nx >= N || ny < 0 || ny >= M || maze[nx][ny] == 0) continue;

                // 현재 shortDistance[nx][ny]가 가지고 있는 값이 지금 다른 경로로 들어오는 값보다 작거나 같다면
                // 넣을 필요가 없으므로 continue
                if(shortDistance[nx][ny] <= shortDistance[x][y] + maze[nx][ny]) continue;

                // shortDistance[nx][ny]에 더 작은 값이 들어올 수 있다면 넣고, 그 좌표를 queue에 넣는다.
                shortDistance[nx][ny] = shortDistance[x][y] + maze[nx][ny];
                q.offer(new Node(nx, ny));
            }
        }
    }
}
