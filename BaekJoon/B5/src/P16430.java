/*
 * BOJ 16430 제리와 톰
 *
 * memory : 14280kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P16430 {

    private static int a, b;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();
        sb.append(b - a).append(" ").append(b);
        System.out.print(sb);
    }
}
