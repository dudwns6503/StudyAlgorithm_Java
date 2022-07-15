/*
 * BOJ 2178 미로 탐색
 *
 * memory : 14680kb
 * time : 144ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2178 {

    static int[][] dist;
    static int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    static String[] maze;
    static int N, M;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new String[N];
        dist = new int[N][M];

        for(int i=0; i<N; i++) {
            maze[i] = br.readLine();
        }
    }

    static void bfs(int x, int y) {

        Queue<Integer> que = new LinkedList<>();

        que.add(x);
        que.add(y);
        dist[x][y] = 1;

        while(!que.isEmpty()) {
            x = que.poll();
            y = que.poll();

            for(int k=0; k<4; k++) {
                int nx = x + dir[k][0];
                int ny = y + dir[k][1];

                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if(dist[nx][ny] != -1) continue;
                if(maze[nx].charAt(ny) == '0') continue;

                que.add(nx);
                que.add(ny);
                dist[nx][ny] = dist[x][y] + 1;
            }
        }

    }

    static void pro() {

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                dist[i][j] = -1;
            }
        }

        bfs(0, 0);
        System.out.print(dist[N-1][M-1]);
    }


    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}