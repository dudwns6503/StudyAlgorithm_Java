/*
 * BOJ 鉛筆 2 (Pencils 2)
 *
 * memory : 14148kb
 * time : 100ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P33161 {

    private static int a;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        System.out.print(a / 5);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.parseInt(br.readLine());
    }
}
