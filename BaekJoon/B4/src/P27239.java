/*
 * BOJ 27239 Шахматная доска
 *
 * memory : 16132kb
 * time : 152ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P27239 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int row = 0;
        char column;

        if (n % 8 == 0) {
            row = n / 8;
            column = (char) (7 + 'a');
        } else {
            row = n / 8 + 1;
            column = (char) ((n % 8 - 1) + 'a');
        };

        System.out.print(column + String.valueOf(row));
    }
}
