/*
BaekJoon 7576 토마토

BFS
*/

import java.util.*;
import java.io.*;

public class P7576 {

    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N, M, day;

    static class Node {
        int x, y, day;

        public Node(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs();

        // 모든 토마토가 익었다면 날짜를 출력, 익지않은 토마토가 있다면 -1 출력
        int answer = areAllTomatosRiped() ? day : -1;
        System.out.print(answer);
    }

    private static void bfs() {
        Queue<Node> q = new LinkedList<Node>();
        day = 0;

        // 토마토 좌표와 토마토가 익은 날짜(처음이므로 0)를 queue에 넣는다.
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(map[i][j] == 1) q.offer(new Node(i, j, 0));
            }
        }

        while(!q.isEmpty()) {
            Node node = q.poll();
            day = node.day;

            for(int dir=0; dir<4; dir++) {
                int nx = node.x + dx[dir];
                int ny = node.y + dy[dir];

                // 범위를 벗어나면 다음 방향으로 넘어간다.
                if(nx < 0 || nx >= N || ny < 0 || ny >= M) continue;

                // 익지않은 토마토가 4방향 중에 있다면 익은 토마토(1)로 변경 후 queue에 넣어준다.
                // 토마토가 익으려면 하루가 지나야 하므로 day+1이다.
                if(map[nx][ny] == 0) {
                    map[nx][ny] = 1;
                    q.add(new Node(nx, ny, day+1));
                }
            }
        }
    }

    // 맵에 익지않은 토마토가 있다면 false, 모든 토마토가 익었다면 true
    private static boolean areAllTomatosRiped() {
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(map[i][j] == 0)
                    return false;
            }
        }
        return true;
    }
}
