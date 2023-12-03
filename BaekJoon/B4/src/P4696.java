/*
 * BOJ 4696 St. Ives
 *
 * memory : 14384kb
 * time : 136ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P4696 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();

            if (str.equals("0"))
                break;

            solve(str);
        }
    }

    private static void solve(String number) {
        double d = Double.parseDouble(number);

        double ans = 1 + d + d * d + d * d * d + d * d * d * d;

        System.out.printf("%.2f\n", ans);
    }
}
