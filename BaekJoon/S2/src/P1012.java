/*
 * BOJ 1012 유기농 배추
 */

import java.io.*;
import java.util.*;

public class P1012 {

    // 맵의 좌표를 나타내는 Node 클래스 선언 -> 이후에 queue에 들어감.
    static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    /**
     * T : testCase 갯수
     * map : 땅을 나타내는 2차원 int형 배열
     * visited : 땅의 방문을 확인하는 2차원 boolean형 배열
     * dx, dy : 상, 하, 좌, 우 사방 탐색을 할 수 있게하는 1차원 int형 배열
     * N : 행 길이
     * M : 열 길이
     * K : 배추의 갯수
     * ans : 배추흰지렁이 마리 수
     *
     */
    static int[][] map;
    static boolean[][] visited;
    // 상, 하, 좌, 우
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N, M, K, ans;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int test_case=1; test_case<=T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new int[N][M];
            // 방문을 체크할 visited배열
            visited = new boolean[N][M];

            for(int i=0; i<K; i++) {
                st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());

                map[x][y] = 1;
            }

            // 매 testCase마다 0으로 초기화
            ans = 0;

            // 배추가 있다면 그 자리에서 bfs실행
            for(int i=0; i<N; i++) {
                for(int j=0; j<M; j++) {
                    if(map[i][j] == 1)
                        bfs(i, j);
                }
            }

            // 배추흰지렁이의 갯수를 출력
            System.out.println(ans);
        }

    }

    /**
     * 배추가 있는 곳에서 bfs하는 함수이다.
     * @param x : map의 x좌표
     * @param y : map의 y좌표
     */
    private static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));

        // q에 넣고 방문처리를 한다.
        visited[x][y] = true;

        // 총 bfs실행한 횟수가 배추흰지렁이의 마릿수와 같다.
        ans++;

        while(!q.isEmpty()) {
            Node node = q.poll();
            x = node.x;
            y = node.y;

            // 배추가 있다면 배추를 없애고 총 배추의 개수도 --한다.
            if(map[x][y] == 1) {
                map[x][y] = 0;
                K--;
            }

            // 배추가 더 이상 없다면 종료
            if(K==0) return;

            for(int d=0; d<4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                // 다음 탐색이 범위를 벗어난다면 다음 방향으로 탐색
                if(nx < 0 || nx >= N || ny < 0 || ny >= M) continue;

                // 배추가 없거나 이미 방문한 곳이라면 continue;
                if(map[nx][ny] == 0 || visited[nx][ny]) continue;

                // 배추가 있다면 queue에 넣고 방문처리를 완료한다.
                if(map[nx][ny] == 1) {
                    q.offer(new Node(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }
    }
}