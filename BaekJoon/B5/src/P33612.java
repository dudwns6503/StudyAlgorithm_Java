/*
 * BOJ 33612 피갤컵
 *
 * memory : 15912kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P33612 {

    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        int year = 2024;
        int month = 8;

        month += 7 * (n - 1);

        if (month % 12 == 0) {
            year += (month / 12) - 1;
            month = 12;
        }
        else {
            year += month / 12;
            month %= 12;
        }

        System.out.print(year + " " + month);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
    }
}
