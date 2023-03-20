/*
 * BOJ 15894 수학은 체육과목 입니다
 *
 * memory : 14276kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P15894 {

    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
    }

    private static void solve() {
        long ans = 4L * n;
        System.out.print(ans);
    }
}
