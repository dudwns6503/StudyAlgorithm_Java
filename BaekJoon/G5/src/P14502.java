/*
BaekJoon 14502 연구소

조합과 BFS를 통해 해결한 문제이다.
*/

import java.util.*;
import java.io.*;

public class P14502 {

    static class Virus {
        int x, y;

        public Virus(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int[][] map;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static int N, M, answer;
    private static ArrayList<Virus> virusList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 2)
                    virusList.add(new Virus(i, j));
            }
        }

        makeWall(0);
        System.out.print(answer);
    }

    private static void makeWall(int count) {
        // 기저조건(벽 세개 모두 맵에 만들었다면) 달성했으면 원본 맵을 복사해주고 복사한 맵으로 나머지를 진행한다.
        // 그 후 원본 맵은 다시 원래대로 복원.
        if(count == 3) {
            int[][] copyMap = new int[N][M];

            for(int i=0; i<N; i++) {
                for(int j=0; j<M; j++) {
                    copyMap[i][j] = map[i][j];
                }
            }

            for(Virus virus: virusList) {
                spreadVirus(virus, copyMap);
            }

            countSafeArea(copyMap);
            return;
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(map[i][j] == 0) {
                    map[i][j] = 1;
                    makeWall(count+1);
                    map[i][j] = 0;
                }
            }
        }
    }

    private static void spreadVirus(Virus virus, int[][] map) {
        Queue<Virus> queue = new LinkedList<>();
        queue.offer(virus);

        while(!queue.isEmpty()) {
            Virus virus2 = queue.poll();

            for(int i=0; i<4; i++) {
                int nx = virus2.x + dx[i];
                int ny = virus2.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;

                if(map[nx][ny] == 0) {
                    map[nx][ny] = 2;
                    queue.offer(new Virus(nx, ny));
                }
            }
        }
    }

    private static void countSafeArea(int[][] map) {
        int count = 0;

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(map[i][j] == 0)
                    count++;
            }
        }

        answer = Math.max(answer, count);
    }
}
