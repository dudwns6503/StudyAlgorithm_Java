/*
 * BOJ 32326 Conveyor Belt Sushi
 *
 * memory : 14104kb
 * time : 100ms
 */



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P32326 {

    private static int r, g, b;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        System.out.print(r * 3 + g * 4 + b * 5);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        r = Integer.parseInt(br.readLine());
        g = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
    }
}
