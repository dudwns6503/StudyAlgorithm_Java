/*
 * BOJ 19698 헛간 청약
 *
 * memory : 14060kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P19698 {

    private static int n, w, h, l;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        int hCnt = h / l;
        int wCnt = w / l;

        System.out.print(Math.min(n, hCnt * wCnt));
    }
}
