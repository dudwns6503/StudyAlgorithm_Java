/*
 * BOJ 28444 HI-ARC=?
 *
 * memory : 14196kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P28444 {

    private static int H, I, A, R, C;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        H = Integer.parseInt(st.nextToken());
        I = Integer.parseInt(st.nextToken());
        A = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        solve();
    }

    private static void solve() {
        int a = H * I;
        int b = A * R * C;

        System.out.print(a - b);
    }
}
