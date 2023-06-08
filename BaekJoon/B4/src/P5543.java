/*
 * BOJ 5543 상근날드
 *
 * memory : 14244kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P5543 {

    private static int[] burger, beverage;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        burger = new int[3];
        beverage = new int[2];

        for (int i = 0; i < 3; i++) {
            burger[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 2; i++) {
            beverage[i] = Integer.parseInt(br.readLine());
        }
    }

    private static void solve() {
        Arrays.sort(burger);
        Arrays.sort(beverage);

        System.out.print(burger[0] + beverage[0] - 50);
    }
}
