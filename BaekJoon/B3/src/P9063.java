/*
 * BOJ 9063 대지
 *
 * memory : 27584kb
 * time : 304ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9063 {

    private static int min_x, min_y, max_x, max_y;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        max_x = Integer.MIN_VALUE;
        max_y = Integer.MIN_VALUE;
        min_x = Integer.MAX_VALUE;
        min_y = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            min_x = Math.min(x, min_x);
            max_x = Math.max(x, max_x);
            min_y = Math.min(y, min_y);
            max_y = Math.max(y, max_y);
        }
    }

    private static void solve() {
        int x = Math.abs(max_x - min_x);
        int y = Math.abs(max_y - min_y);

        System.out.print(x * y);
    }
}
