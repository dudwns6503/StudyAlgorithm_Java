/*
 * BOJ 1924 2007년
 *
 * memory : 14136kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1924 {

    private static final int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String[] monthName = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    private static int x, y;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        int total = 0;

        for (int i = 0; i < x - 1; i++) {
            total += month[i];
        }

        total += y - 1;

        System.out.print(monthName[total % 7]);
    }
}
