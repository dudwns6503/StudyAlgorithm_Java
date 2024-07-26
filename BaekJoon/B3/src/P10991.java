/*
 * BOJ 10991 별 찍기 - 16
 *
 * memory : 14332kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10991 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                sb.append(" ");
            }

            for (int j = 1; j <= i; j++) {
                sb.append("*").append(" ");
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
