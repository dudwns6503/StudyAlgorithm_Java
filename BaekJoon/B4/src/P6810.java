/*
 * BOJ 6810 ISBN
 *
 * memory : 15844kb
 * time : 144ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P6810 {

    private static int first, second, third;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        first = Integer.parseInt(br.readLine());
        second = Integer.parseInt(br.readLine());
        third = Integer.parseInt(br.readLine());

        solve();
    }

    private static void solve() {
        int sum = 91;

        sum += first;
        sum += second * 3;
        sum += third;

        System.out.print("The 1-3-sum is " + sum);
    }
}
