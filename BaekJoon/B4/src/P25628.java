/*
 * BOJ 25628 햄버거 만들기
 *
 * memory : 14284kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25628 {

    private static int bread, patty;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        bread = Integer.parseInt(st.nextToken());
        patty = Integer.parseInt(st.nextToken());
    }

    private static void solve() {
        int needPattyCount = bread / 2;

        if (needPattyCount > patty) {
            System.out.print(patty);
        } else {
            System.out.print(needPattyCount);
        }
    }
}
