package S1.src;

/*
 * BOJ 18405 경쟁적 전염
 *
 * memory : 63824kb
 * time : 680ms
 */

import java.util.*;

/**
 *  경쟁적 전염(이코테)
 *
 *  Virus(바이러스 종류, 초, x좌표, y좌표) - 바이러스 종류의 숫자를 기준으로 오름차순
 *  map: 시험관을 나타내는 2차원 정수형 배열(N x N)
 *  n: 시험관의 크기
 *  k: 바이러스의 번호(k 이하)
 *  s: s초
 *  x: 확인하고 싶은 위치의 x좌표
 *  y: 확인하고 싶은 위치의 y좌표
 *
 *  Virus class를 오름차순으로 정렬하는 것과 ArrayList에 담겨져 있는 바이러스들을 queue로 옮기는 테크닉이 중요하다.
 */

public class P18405 {

    static class Virus implements Comparable<Virus> {
        int index, second, x, y;

        public Virus(int index, int second, int x, int y) {
            this.index = index;
            this.second = second;
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Virus other) {
            if(this.index < other.index) {
                return -1;
            }
            return 1;
        }
    }

    public static int[][] map;
    public static ArrayList<Virus> virusList = new ArrayList<>();
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static int n, k, s, x, y;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        map = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        s = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(map[i][j] != 0) {
                    virusList.add(new Virus(map[i][j], 0, i, j));
                }
            }
        }

        Collections.sort(virusList);

        bfs();

        System.out.println(map[x-1][y-1]);
    }

    public static void bfs() {
        Queue<Virus> q = new LinkedList<>();

        for(int i=0; i<virusList.size(); i++) {
            q.offer(virusList.get(i));
        }

        while(!q.isEmpty()) {
            Virus virus = q.poll();

            // second만큼 초가 지나거나, 큐가 빌 때까지 반복한다.
            if(virus.second == s) break;

            for(int i=0; i<4; i++) {
                int nx = virus.x + dx[i];
                int ny = virus.y + dy[i];

                // 다음 위치가 범위를 벗어나는 경우 넘어간다.
                if(nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                // 시험관에 이미 바이러스가 있다면(방문했다면) 넘어간다.
                if(map[nx][ny] != 0) continue;
                map[nx][ny] = virus.index;
                q.offer(new Virus(virus.index, virus.second+1, nx, ny));
            }
        }

    }
}
