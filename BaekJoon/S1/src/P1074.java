/*
 * BOJ 1074 Z
 *
 * memory : 14292kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1074 {

    private static int n, r, c;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
    }

    /**
     * 1 2
     * 3 4
     */
    private static void solve() {
        int height = (int) Math.pow(2, n - 1);
        int width = height;

        rec_func(height, width, r, c, 0);
    }

    private static void rec_func(int x, int y, int r, int c, int num) {
        // 몇 사분면인지 체크해야함.
        // x : 세로, y : 가로
        if (x == 0 && y == 0) {
            System.out.print(num);
            return;
        }

        // 1사분면
        if (r < x && c < y) {
            rec_func(x / 2, y / 2, r, c, num);
        }
        // 2사분면
        else if (r < x && c >= y) {
            rec_func(x / 2, y / 2, r, c - y, num + x * y);
        }
        // 3사분면
        else if (r >= x && c < y) {
            rec_func(x / 2, y / 2, r - x, c, num + (x * y) * 2);
        }
        // 4사분면
        else {
            rec_func(x / 2, y / 2, r - x, c - y, num + (x * y) * 3);
        }
    }
}
