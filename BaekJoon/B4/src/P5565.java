/*
 * BOJ 5565 영수증
 *
 * memory : 14068kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5565 {

    private static int totalPrice;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        System.out.print(totalPrice);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        totalPrice = Integer.parseInt(br.readLine());

        for (int i = 0; i < 9; i++) {
            totalPrice -= Integer.parseInt(br.readLine());
        }
    }
}
