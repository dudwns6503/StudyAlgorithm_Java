/*
 * BOJ 17143 낚시왕
 *
 * memory : 112692kb
 * time : 728ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P17143 {

    private static Shark[][] board;
    // 0: 상, 1: 좌, 2: 하, 3: 우
    private static int[][] dir = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    private static int r, c, m, catchSize;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new Shark[r + 1][c + 1];
        catchSize = 0;

        /**
         *  r : 상어의 위치(x)
         *  c : 상어의 위치(y)
         *  s : 상어의 속력
         *  d : 이동 방향
         *  z : 크기
         */
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            // 주어진 값과 내가 사용하는 값을 비교
            // 1  2  3  4
            // 상,하,우,좌
            // 0  1  2  3
            // 상,좌,하,우
            if (d == 1) {
                d = 0;
            } else if (d == 4) {
                d = 1;
            }

            board[r][c] = new Shark(r, c, s, d, z);
        }
    }


    private static void solve() {
        // 1. 낚시왕이 c까지만 반복해서 이동한다.
        for (int j = 1; j <= c; j++) {
            // 2. 땅과 제일 가까운 상어를 잡는다.
            for (int i = 1; i <= r; i++) {
                if (board[i][j] != null) {
                    catchSize += board[i][j].size;
                    board[i][j] = null;
                    break;
                }
            }

            // 3 상어가 이동한다.
            moveShark();
        }

        // 4. 낚시 왕이 이동을 마치면 잡은 물고기 수를 출력한다.
        System.out.print(catchSize);
    }

    private static void moveShark() {
        // 배열을 하나 더 만들기 싫어서 Queue 사용.
        Queue<Shark> queue = new LinkedList<>();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                // 현재 칸에 상어가 있다면
                if (board[i][j] != null) {
                    queue.add(new Shark(i, j, board[i][j].speed, board[i][j].direction, board[i][j].size));
                }
            }
        }

        // 이동 후 상어를 저장하기 위해 초기화.
        board = new Shark[r + 1][c + 1];

        while (!queue.isEmpty()) {
            Shark shark = queue.poll();

            // 상어 이동
            go(shark.x, shark.y, shark.speed, shark.direction, shark.size);
        }
    }

    // 0   1   2   3
    // 상, 좌, 하, 우
    private static void go(int x, int y, int speed, int direction, int size) {
        int realSpeed = speed;
        // 위, 아래일 경우
        if (direction == 0 || direction == 2) {
            realSpeed %= (r - 1) * 2;
        } else {
            realSpeed %= (c - 1) * 2;
        }

        for (int i = 0; i < realSpeed; i++) {
            int nx = x + dir[direction][0];
            int ny = y + dir[direction][1];

            // 벽에 부딪힌다면 이동을 취소하고 방향 반대로
            if (nx <= 0 || nx >= r + 1 || ny <= 0 || ny >= c + 1) {
                x -= dir[direction][0];
                y -= dir[direction][1];
                direction = (direction + 2) % 4;
                continue;
            }

            x = nx;
            y = ny;
        }

        // 만약 이동한 칸에 상어가 있다면
        if (board[x][y] != null) {
            // 이후에 들어온 상어가 크기가 더 크다면
            if (board[x][y].size < size) {
                board[x][y] = new Shark(x, y, speed, direction, size);
            }
        }
        // 상어가 없다면
        else {
            board[x][y] = new Shark(x, y, speed, direction, size);
        }
    }

    static class Shark {
        int x;
        int y;
        int speed;
        int direction;
        int size;

        public Shark(int x, int y, int speed, int direction, int size) {
            this.x = x;
            this.y = y;
            this.speed = speed;
            this.direction = direction;
            this.size = size;
        }
    }
}
