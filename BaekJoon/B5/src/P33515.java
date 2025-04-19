/*
 * BOJ 33515 노트북 세 대를 가지고 왔다
 *
 * memory : 14164kb
 * time : 100ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P33515 {

    private static int a, b;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        System.out.print(Math.min(a, b));
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
    }
}
