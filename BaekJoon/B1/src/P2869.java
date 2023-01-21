/*
 * BOJ 2869 달팽이는 올라가고 싶다
 *
 * memory : 14156kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2869 {

    private static int a, b, v;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        int day = 0;

        day = (v - b) % (a - b) == 0
                ? (v - b) / (a - b)
                : (v - b) / (a - b) + 1;

        System.out.print(day);
    }
}
