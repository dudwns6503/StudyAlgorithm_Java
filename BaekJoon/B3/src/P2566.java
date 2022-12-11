/*
 * BOJ 2566 최댓값
 *
 * memory : 14084kb
 * time : 156ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2566 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int max = -1;
        int num = 0;
        int row = 0;
        int col = 0;

        for (int i = 1; i <= 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 9; j++) {
                num = Integer.parseInt(st.nextToken());

                if (num > max) {
                    max = num;
                    row = i;
                    col = j;
                }
            }
        }

        sb.append(max).append("\n");
        sb.append(row).append(" ").append(col);
        System.out.print(sb);
    }
}
