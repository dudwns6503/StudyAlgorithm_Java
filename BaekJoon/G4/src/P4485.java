/*
 * BOJ 4485 녹색 옷 입은 애가 젤다지?
 */

import java.util.*;
import java.io.*;

public class P4485 {

    // queue에 넣을 좌표를 가지고 있는 Node 클래스
    static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    // 입력값을 받는 2차원 정수형 배열 map과 BFS를 통해 루피의 최솟값만을 가지는 rupeeMinMap배열
    static int[][] map, rupeeMinMap;
    // 상, 하, 좌, 우
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test_case=1;

        // 무한루프실행
        while(true) {
            N = Integer.parseInt(br.readLine());

            // N==0이면 반복을 종료한다.
            if(N==0) break;

            map = new int[N][N];
            rupeeMinMap = new int[N][N];

            for(int i=0; i<N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=0; j<N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());

                    // rupeeMinMap은 최솟값을 가지기 위해서 최댓값으로 초기화한다.
                    rupeeMinMap[i][j] = Integer.MAX_VALUE;
                }
            }

            // 링크의 시작위치는 (0,0)이므로 rupeeMinMap[0][0]에 map[0][0]의 값을 넣어준다.
            rupeeMinMap[0][0] = map[0][0];

            bfs();

            /*
             * rupeeMinMap의 원소들은 BFS 탐색을 통해서 모든 경로 중 최솟값을 가지고 있으며,
             * 동굴의 출구는 (N-1, N-1)이므로, rupeeMinMap[N-1][N-1]을 출력해주면 된다.
             */
            System.out.println("Problem " + test_case + ": " + rupeeMinMap[N-1][N-1]);
            test_case++;
        }

    }

    private static void bfs() {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(0, 0));

        while(!q.isEmpty()) {
            Node node = q.poll();
            int x = node.x;
            int y = node.y;

            for(int k=0; k<4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                if(nx < 0 || nx >= N || ny < 0 || ny >= N) continue;

                /*
                 *  현재 방향으로 탐색하여 더한 루피 값이 이미 rupeeMinMap[nx][ny]에 들어 있는 값보다 크거나 같다면
                 *  queue에 넣지 않고 다음 방향으로 넘어간다.
                 *
                 *  무슨 말이냐면, 사방탐색을하면서 rupeeMinMap 2차원 배열의 원소는 Integer.MAX_VALUE -> rupee의 최솟값으로 바뀌고 있다.
                 *  이미 rupeeMinMap[nx][ny]에 경로의 모든 경우의 수 중 최솟값이 들어갔다고 생각해보자.
                 *  어떠한 다른 경로를 통해서 다시 rupeeMinMap[nx][ny]에 도달하였을 때,
                 *  이미 rupeeMinMap[nx][ny]는 최솟값을 가지고 있으므로, 값을 변경해서는 안된다.
                 *
                 *  즉, 아래 if문은 rupeeMinMap 배열에 최솟값만을 넣기 위한 작업이다.
                 */
                if(rupeeMinMap[nx][ny] <= rupeeMinMap[x][y] + map[nx][ny]) continue;

                rupeeMinMap[nx][ny] = rupeeMinMap[x][y] + map[nx][ny];
                q.add(new Node(nx, ny));
            }
        }
    }
}