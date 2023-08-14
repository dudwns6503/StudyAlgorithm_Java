/*
 * BOJ 25238 가희와 방어율 무시
 *
 * memory : 14244kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25238 {

    private static int a, b;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        solve();
    }

    private static void solve() {
        if (a - ((double) a / 100 * b) >= 100)  {
            System.out.print(0);
        } else {
            System.out.print(1);
        }
    }
}
