/*
 * BOJ 16486 운동장 한 바퀴
 *
 * memory : 14228kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P16486 {

    private static final double PI = 3.141592;
    private static int d1, d2;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        d1 = Integer.parseInt(br.readLine());
        d2 = Integer.parseInt(br.readLine());

        solve();
    }

    private static void solve() {
        System.out.print(d2 * 2 * PI + 2 * d1);
    }
}
