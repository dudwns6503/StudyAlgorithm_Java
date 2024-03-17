/*
 * BOJ 25858 Divide the Cash
 *
 * memory : 14204kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25858 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int numbers = 0;
        int[] dollars = new int[n];
        for (int i = 0; i < n; i++) {
            dollars[i] = Integer.parseInt(br.readLine());
            numbers += dollars[i];
        }

        int dollar = d / numbers;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(dollar * dollars[i]).append("\n");
        }

        if (sb.length() > 1)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
