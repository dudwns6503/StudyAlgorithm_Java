/*
 * BOJ 7576 토마토
 *
 * memory : 151640kb
 * time : 776ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P7576 {

    static Queue<Integer> que = new LinkedList<>();
    static int[][] dist;
    static int[][] storage;
    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int N, M, ans;

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        storage = new int[N][M];
        dist = new int[N][M];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                storage[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    static void bfs() {

        while(!que.isEmpty()) {
            int x = que.poll();
            int y = que.poll();

            for(int k=0; k<4; k++) {
                int nx = x + dir[k][0];
                int ny = y + dir[k][1];

                // nx, ny가 범위를 벗어나면 continue
                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                // 이미 방문했던 노드라면 continue
                if(dist[nx][ny] != -1) continue;
                // 익지 않은 토마토라면 continue
                if(storage[nx][ny] != 0) continue;

                // 토마토를 익은 토마토로 바꿔준 후
                storage[nx][ny] = 1;
                // queue에 x좌표와 y좌표 저장.
                que.offer(nx);
                que.offer(ny);
                // 현재 거리를 이전 거리 + 1로 저장.
                dist[nx][ny] = dist[x][y] + 1;
            }
        }
    }

    static void distCount() {
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                // 토마토가 모두 익지 않은 상태가 있다면 -1을 저장하고 리턴한다.
                if(storage[i][j] == 0) {
                    ans = -1;
                    return;
                }

                // 토마토가 모두 익었다면 dist의 최댓값을 ans에 저장.
                ans = Math.max(ans, dist[i][j]);
            }
        }
    }

    static void pro() {

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                // dist에 초깃값을 모두 -1로 지정.
                dist[i][j] = -1;

                // 익은 토마토가 있다면 x좌표 y좌표 순으로 queue에 집어넣고 현재 초기 거리를 0으로 설정.
                if(storage[i][j] == 1) {
                    que.add(i);
                    que.add(j);
                    dist[i][j] = 0;
                }
            }
        }

        bfs();
        distCount();
        System.out.print(ans);
    }

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }
}
