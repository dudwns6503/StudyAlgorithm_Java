/*
 * BOJ 27310 :chino_shock:
 *
 * memory : 14304kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P27310 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] str = s.split("");

        int length = str.length;
        int colons_number = 0;
        int under_bar_number = 0;

        for (int i = 0; i < length; i++) {
            if (str[i].equals(":")) {
                colons_number++;
            } else if (str[i].equals("_")) {
                under_bar_number++;
            }
        }

        int ans = length + colons_number + (under_bar_number * 5);
        System.out.print(ans);
    }
}
