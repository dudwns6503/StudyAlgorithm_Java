/*
 * BOJ 1373 2진수 8진수
 *
 * memory : 39504kb
 * time : 328ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1373 {

    private static String num;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        // 2진수 -> 8진수 -> 3자리씩 끊는다.
        int dividedByThree = num.length() % 3;

        if (dividedByThree != 0) {
            for (int i = 0; i < 3 - dividedByThree; i++) {
                num = "0" + num;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length(); i += 3) {
            String oct = num.substring(i, i + 3);
            int currentNum = Integer.parseInt(oct, 2);
            sb.append(currentNum);
        }

        System.out.print(sb);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        num = br.readLine();
    }
}
