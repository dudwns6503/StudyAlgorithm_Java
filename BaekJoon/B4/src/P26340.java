/*
 * BOJ 26340 Fold the Paper Nicely
 *
 * memory : 14120kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P26340 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int side1 = Integer.parseInt(st.nextToken());
            int side2 = Integer.parseInt(st.nextToken());
            int foldNumber = Integer.parseInt(st.nextToken());

            sb.append("Data set: ").append(side1).append(" ").append(side2).append(" ").append(foldNumber).append("\n");
            int max = side1;
            int min = side2;

            for (int j = 0; j < foldNumber; j++) {
                side1 = max;
                side2 = min;
                max = Math.max(side1, side2);
                min = Math.min(side1, side2);

                max /= 2;
            }

            sb.append(Math.max(max, min)).append(" ").append(Math.min(max, min)).append("\n").append("\n");
        }

        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
        }

        System.out.print(sb);
    }
}
