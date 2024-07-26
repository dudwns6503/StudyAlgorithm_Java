/*
 * BOJ 10992 별 찍기 - 17
 *
 * memory : 14304kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10992 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i != n) {
                for (int j = n - i; j > 0; j--) {
                    sb.append(" ");
                }

                if (i == 1) {
                    sb.append("*");
                }
                else {
                    sb.append("*");
                    for (int j = 1; j <= (2 * (i - 1)) - 1; j++)
                        sb.append(" ");

                    sb.append("*");
                }
                sb.append("\n");
            }
            else {
                for (int j = 1; j <= (2*i - 1); j++) {
                    sb.append("*");
                }
            }
        }

        System.out.print(sb);
    }
}
