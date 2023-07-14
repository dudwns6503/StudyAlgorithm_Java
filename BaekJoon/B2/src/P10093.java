/*
 * BOJ 10093 숫자
 *
 * memory : 29408kb
 * time : 1088ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10093 {

    private static long a, b;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
    }

    private static void solve() {
        long min = Math.min(a, b);
        long max = Math.max(a, b);

        if (min == max) {
            System.out.print("0");
        } else {
            System.out.println(max - min - 1);
            for (long i = min + 1; i < max; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
