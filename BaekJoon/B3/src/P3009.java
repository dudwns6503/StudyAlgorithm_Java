/*
 * BOJ 3009 네 번째 점
 *
 * memory : 14304kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P3009 {

    private static int[] x = new int[3];
    private static int[] y = new int[3];

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());

            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(x);
        Arrays.sort(y);

        int ansX = -1;
        int ansY = -1;

        if (x[0] == x[1]) {
            ansX = x[2];

            if (y[0] == y[1]) {
                ansY = y[2];
            } else {
                ansY = y[0];
            }
        } else {
            ansX = x[0];

            if (y[0] == y[1]) {
                ansY = y[2];
            } else {
                ansY = y[0];
            }
        }

        sb.append(ansX).append(" ").append(ansY);
        System.out.print(sb);
    }
}
