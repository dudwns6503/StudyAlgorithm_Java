/*
 * BOJ 5532 방학 숙제
 *
 * memory : 14152kb
 * time : 116ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5532 {

    private static int L, A, B, C, D;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        L = Integer.parseInt(br.readLine());
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());
        D = Integer.parseInt(br.readLine());

        solve();
    }

    private static void solve() {
        while (L > 0) {
            L--;

            A -= C;
            B -= D;

            if (A <= 0 && B <= 0) break;
        }

        System.out.print(L);
    }

}
