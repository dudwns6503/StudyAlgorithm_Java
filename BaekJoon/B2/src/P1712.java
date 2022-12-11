/*
 * BOJ 1712 손익분기점
 *
 * memory : 14208kb
 * time : 124ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1712 {

    static int a, b, c;

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        if (c - b <= 0) {
            System.out.println("-1");
            return;
        }

        System.out.print(a / (c-b) + 1);
    }
}
