/*
SW Expert Academy 문제 1249 [S/W 문제해결 응용] 4일차 - 보급로

BOJ 4485 문제와 내용만 다르지 풀이방법은 똑같은 문제이다.
*/

import java.util.*;
import java.io.*;

public class P1249 {

    static int[][] map, minRecoveryTime;
    // 상, 하, 좌, 우
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int test_case=1; test_case<=T; test_case++) {
            N = Integer.parseInt(br.readLine());

            map = new int[N][N];

            // 최소 복구 시간을 저장할 2차원 정수형 배열
            minRecoveryTime = new int[N][N];

            // 띄어쓰기가 없는 입력을 처리하는 방법
            for(int i=0; i<N; i++) {
                String str = br.readLine();
                for(int j=0; j<N; j++) {
                    map[i][j] = str.charAt(j) - '0';

                    // 최솟값을 넣기 위하여 최댓값으로 초기화
                    minRecoveryTime[i][j] = Integer.MAX_VALUE;
                }
            }

            // 출발지가 (0, 0)이므로 map[0][0]을 minRecoryTime[0][0]에 넣어준다.
            minRecoveryTime[0][0] = map[0][0];

            bfs();

            // 각 testCase마다 도착지의 최솟값(minRecovryTime[N-1][N-1])을 출력해준다.
            System.out.println("#" + test_case + " " + minRecoveryTime[N-1][N-1]);

        }
    }

    // 좌표를 나타내는 Node클래스를 선언.
    static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static void bfs() {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(0, 0));

        while(!q.isEmpty()) {
            Node node = q.poll();
            int x = node.x;
            int y = node.y;

            // 사방탐색
            for(int d=0; d<4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                // 다음 탐색이 범위를 벗어나면 다음 방향으로 탐색한다.
                if(nx < 0 || nx >= N || ny < 0 || ny >= N) continue;

                // 현재 가지고 있는 최솟값보다 이후에 들어오는 값이 크다면 queue에 넣지 않고 다음 방향으로 탐색한다.
                if(minRecoveryTime[nx][ny] <= map[nx][ny] + minRecoveryTime[x][y]) continue;

                // 최솟값이라면 배열에 값을 넣어주고 큐에 다음 좌표를 넣어준다.
                minRecoveryTime[nx][ny] = map[nx][ny] + minRecoveryTime[x][y];
                q.offer(new Node(nx, ny));
            }
        }
    }
}
