/*
 * BOJ 1002 터렛
 *
 * memory : 14272kb
 * time : 136ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1002 {

    private static int x1, x2, y1, y2, r1, r2;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());

            System.out.println(solve());
        }
    }

    private static int solve() {

        // 중점간 거리의 제곱
        int distance = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (r1 == 0) return 0;

        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        } else if (distance > Math.pow(r1 + r2, 2)) {
            return 0;
        } else if (distance < Math.pow(r2 - r1, 2)) {
            return 0;
        } else if (distance == Math.pow(r2 - r1, 2)) {
            return 1;
        } else if (distance == Math.pow(r1 + r2, 2)) {
            return 1;
        } else {
            return 2;
        }

    }
}
