/*
 * BOJ 15726 이칙연산
 *
 * memory : 14180kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15726 {

    private static int A, B, C;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        solve();
    }

    private static void solve() {
        if ((double) A / B * C >= (double) B / C * A) {
            System.out.print((int) Math.floor((double) A / B * C));
        } else {
            System.out.print((int) Math.floor((double) B / C * A));
        }
    }
}
