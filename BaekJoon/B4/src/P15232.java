/*
 * BOJ 15232 Rectangles
 *
 * memory : 14136kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P15232 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int r = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < c; i++) {
            str.append("*");
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < r; i++) {
            sb.append(str).append("\n");
        }

        if (sb.length() > 1)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
