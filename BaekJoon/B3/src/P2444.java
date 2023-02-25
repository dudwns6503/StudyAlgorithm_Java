/*
 * BOJ 2444 별 찍기 - 7
 *
 * memory : 14472kb
 * time : 136ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2444 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            int blank = n - i;
            int star = 2 * i - 1;

            while (blank-- != 0) {
                sb.append(" ");
            }

            while (star-- != 0) {
                sb.append("*");
            }
            sb.append("\n");
        }

        for (int i = 1; i <= n - 1; i++) {
            int blank = i;
            int star = 2 * (n - i) - 1;

            while (blank-- != 0) {
                sb.append(" ");
            }

            while (star-- != 0) {
                sb.append("*");
            }
            sb.append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
