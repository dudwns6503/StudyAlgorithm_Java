/*
 * BOJ 32775 가희와 4시간의 벽 1
 *
 * memory : 14256kb
 * time : 100ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P32775 {

    private static int subway, flight;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        if (subway > flight)
            System.out.print("flight");
        else
            System.out.print("high speed rail");
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        subway = Integer.parseInt(br.readLine());
        flight = Integer.parseInt(br.readLine());
    }
}
