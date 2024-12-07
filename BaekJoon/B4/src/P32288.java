/*
 * BOJ 32288 바코드 닉네임
 *
 * memory : 14124kb
 * time : 96ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P32288 {

    private static String str;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        str = str.replace("I", "i");
        str = str.replace("l", "L");

        System.out.print(str);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        str = br.readLine();
    }
}
