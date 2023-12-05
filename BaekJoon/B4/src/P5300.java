/*
 * BOJ 5300 Fill the Rowboats!
 *
 * memory : 13980kb
 * time : 116ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5300 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i).append(" ");

            if (i % 6 == 0)
                sb.append("Go!").append(" ");
        }

        if (n % 6 != 0)
            sb.append("Go!").append(" ");

        sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
