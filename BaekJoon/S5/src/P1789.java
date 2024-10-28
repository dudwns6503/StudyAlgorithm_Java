/*
 * BOJ 1789 수들의 합
 *
 * memory : 14252kb
 * time : 108ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1789 {

    private static long s;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        long sum = 0;
        for (long i = 1; i <= s; i++) {
            sum += i;

            if (s == 1) {
                System.out.print(1);
                break;
            }
            else if (sum > s){
                System.out.print(i - 1);
                break;
            }
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        s = Long.parseLong(br.readLine());
    }
}
