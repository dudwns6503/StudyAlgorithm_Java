/*
 * BOJ 29751 삼각형
 *
 * memory : 14256kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P29751 {

    private static int w, h;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        solve();
    }

    private static void solve() {
        double area = 0.5 * w * h;

        System.out.print(area);
    }
}
