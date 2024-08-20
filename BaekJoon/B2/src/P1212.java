/*
 * BOJ 1212 8진수 2진수
 *
 * memory : 51040kb
 * time : 408ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1212 {

    private static String num;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        sb.append(Integer.toBinaryString(num.charAt(0) - '0'));
        for (int i = 1; i < num.length(); i++) {
            // 각 자리 2진수로 변환
            String strNum = Integer.toBinaryString(num.charAt(i) - '0');

            // 3자리로 패딩
            while (strNum.length() < 3) {
                strNum = "0" + strNum;
            }
            sb.append(strNum);
        }

        System.out.print(sb);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        num = br.readLine();
    }
}
