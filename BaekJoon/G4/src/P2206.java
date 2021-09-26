/*
BaekJoon 2206 벽 부수고 이동하기

BFS와 벽을 부순 경우와 안 부순 경우를 구분하기 위한 3차원 배열
*/

import java.util.*;
import java.io.*;

public class P2206 {

    public static class Node {
        // 거리(distance)와 벽을 부순 여부를 확인할 breakWall
        int x, y, distance, breakWall;

        public Node(int x, int y, int distance, int breakWall) {
            this.x = x;
            this.y = y;
            this.distance = distance;
            this.breakWall = breakWall;
        }
    }

    static int[][] maze;
    // 벽을 부순 경우와 안 부순 경우를 체크하기 위하여 3차원 visited 배열 선언
    static boolean[][][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N, M, min=Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new int[N][M];
        visited = new boolean[N][M][2];

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<M; j++) {
                maze[i][j] = str.charAt(j) - '0';
            }
        }

        bfs();

        // 목적지에 도착하지 못한다면 ans에 -1을, 도착한다면 최솟값을 넣는다.
        int ans = (min != Integer.MAX_VALUE) ? min : -1;
        System.out.print(ans);
    }

    private static void bfs() {
        Queue<Node> q = new LinkedList<Node>();

        visited[0][0][0] = true;
        visited[0][0][1] = true;
        // 0,0부터 거리는 1이고 벽을 부수지 않은 상태로 시작하므로 0
        q.offer(new Node(0, 0, 1, 0));

        while(!q.isEmpty()) {
            Node node = q.poll();
            int x = node.x;
            int y = node.y;
            int distance = node.distance;
            int breakWall = node.breakWall;

            // 목적지에 도착했다면 min값에 최솟값을 넣어준다
            if(x == N-1 && y == M-1) {
                min = Math.min(distance, min);
                continue;
            }

            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || nx >= N || ny < 0 || ny >= M) continue;

                // 이전에 벽을 안 부쉈다면
                if(breakWall == 0 && !visited[nx][ny][0]) {
                    // 벽을 만났을 경우, 벽을 부수는 경우와 벽을 부수지 않은 경우로 나눈다.
                    if(maze[nx][ny] == 1) {
                        q.offer(new Node(nx, ny, distance+1, breakWall+1));
                        visited[nx][ny][1] = true;;
                    } else {
                        q.offer(new Node(nx, ny, distance+1, breakWall));
                        visited[nx][ny][0] = true;
                    }
                    // 이전에 벽을 부쉈다면 벽이 아닌 경우만 체크한다.
                    // why? 벽을 이미 부쉈으므로 벽을 만났다면 갈 수 없으므로 queue에 넣을 필요가 없다.
                } else if(breakWall == 1 && !visited[nx][ny][1]){
                    if(maze[nx][ny] == 0) {
                        q.offer(new Node(nx, ny, distance+1, breakWall));
                        visited[nx][ny][1] = true;
                    }
                }
            }
        }
    }

}
