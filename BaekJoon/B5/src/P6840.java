/*
 * BOJ 6840 Who is in the middle?
 *
 * memory : 14232kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P6840 {

    private static int[] bowls;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        bowls = new int[3];
        for (int i = 0; i < 3; i++) {
            bowls[i] = Integer.parseInt(br.readLine());
        }

        solve();
    }

    private static void solve() {
        Arrays.sort(bowls);

        System.out.print(bowls[1]);
    }
}
