/*
 * BOJ 11365 !밀비 급일
 *
 * memory : 14168kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11365 {

    private static String password;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            password = br.readLine();

            if (password.equals("END")) break;

            solve();
        }
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        sb.append(password);
        System.out.println(sb.reverse());
    }
}
