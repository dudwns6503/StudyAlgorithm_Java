/*
 * BOJ 14499 주사위 굴리기
 *
 * memory : 14436kb
 * time : 140ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14499 {

    private static int[][] map;
    private static int[] order;
    private static int n, m, x, y, k;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        order = new int[k];
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            order[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();
        Dice dice = new Dice(x, y);

        for (int i = 0; i < order.length; i++) {
            // 동
            if (order[i] == 1) {
                // 굴렸을 때 맵의 범위를 넘어간다면 아무것도 하지 않는다.
                if (dice.y + 1 >= m) continue;

                dice.rightRoll();
                // 현재 주사위의 위치에 있는 맵의 값이 0인 경우와 아닌 경우를 판단해서 로직 실행.
                copy(dice);
                // 서
            } else if (order[i] == 2) {
                if (dice.y - 1 < 0) continue;

                dice.leftRoll();
                copy(dice);
                // 북
            } else if (order[i] == 3) {
                if (dice.x - 1 < 0) continue;

                dice.upRoll();
                copy(dice);
                // 남
            } else {
                if (dice.x + 1 >= n) continue;

                dice.downRoll();
                copy(dice);
            }

            sb.append(dice.up).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static void copy(Dice dice) {
        if (map[dice.x][dice.y] == 0) {
            map[dice.x][dice.y] = dice.down;
        } else {
            dice.down = map[dice.x][dice.y];
            map[dice.x][dice.y] = 0;
        }
    }

    static class Dice {
        int x, y;
        int up, down, left, right, front, back;

        public Dice(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void leftRoll() {
            this.y -= 1;
            int temp = this.up;
            this.up = this.right;
            this.right = this.down;
            this.down = this.left;
            this.left = temp;
        }

        public void rightRoll() {
            this.y += 1;
            int temp = this.up;
            this.up = this.left;
            this.left = this.down;
            this.down = this.right;
            this.right = temp;
        }

        public void upRoll() {
            this.x -= 1;
            int temp = this.up;
            this.up = this.front;
            this.front = this.down;
            this.down = this.back;
            this.back = temp;
        }

        public void downRoll() {
            this.x += 1;
            int temp = this.up;
            this.up = this.back;
            this.back = this.down;
            this.down = this.front;
            this.front = temp;
        }
    }
}
