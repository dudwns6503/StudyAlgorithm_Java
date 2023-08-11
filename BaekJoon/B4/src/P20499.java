/*
 * BOJ 20499 Darius님 한타 안 함?
 *
 * memory : 14240kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P20499 {

    private static int K, D, A;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "/");

        K = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());
        A = Integer.parseInt(st.nextToken());

        solve();
    }

    private static void solve() {
        if (K + A < D || D == 0) System.out.print("hasu");
        else System.out.print("gosu");
    }
}
