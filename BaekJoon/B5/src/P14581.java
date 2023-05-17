/*
 * BOJ 14581 팬들에게 둘러싸인 홍준
 *
 * memory : 14212kb
 * time : 176ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P14581 {

    private static String name;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        name = br.readLine();
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        sb.append(":fan::fan::fan:").append("\n").append(":fan::").append(name).append("::fan:").append("\n")
                .append(":fan::fan::fan:");

        System.out.print(sb);
    }
}
