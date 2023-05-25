/*
 * BOJ 28113 정보섬의 대중교통
 *
 * memory : 14232kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P28113 {

    private static int a, b, n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        int max = Math.max(n, b);

        if (max > a) {
            System.out.print("Bus");
        } else if (max == a) {
            System.out.print("Anything");
        } else {
            System.out.print("Subway");
        }
    }
}
