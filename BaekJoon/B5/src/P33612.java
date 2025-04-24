/*
 * BOJ 33612 피갤컵
 *
 * memory : 15912kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.YearMonth;

public class P33612 {

    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        YearMonth ym = YearMonth.of(2024, 8)
                .plusMonths(7 * (n - 1));

        System.out.print(ym.getYear() + " " + ym.getMonthValue());
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
    }
}
