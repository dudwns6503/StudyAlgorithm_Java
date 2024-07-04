/*
 * BOJ 26495 Big Number
 *
 * memory : 14014kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P26495 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] digits = new String[10];
        digits[0] = "0000\n" +
                "0  0\n" +
                "0  0\n" +
                "0  0\n" +
                "0000\n";

        digits[1] = "   1\n" +
                "   1\n" +
                "   1\n" +
                "   1\n" +
                "   1\n";

        digits[2] = "2222\n" +
                "   2\n" +
                "2222\n" +
                "2\n" +
                "2222\n";

        digits[3] = "3333\n" +
                "   3\n" +
                "3333\n" +
                "   3\n" +
                "3333\n";

        digits[4] = "4  4\n" +
                "4  4\n" +
                "4444\n" +
                "   4\n" +
                "   4\n";

        digits[5] = "5555\n" +
                "5\n" +
                "5555\n" +
                "   5\n" +
                "5555\n";

        digits[6] = "6666\n" +
                "6\n" +
                "6666\n" +
                "6  6\n" +
                "6666\n";

        digits[7] = "7777\n" +
                "   7\n" +
                "   7\n" +
                "   7\n" +
                "   7\n";

        digits[8] = "8888\n" +
                "8  8\n" +
                "8888\n" +
                "8  8\n" +
                "8888\n";

        digits[9] = "9999\n" +
                "9  9\n" +
                "9999\n" +
                "   9\n" +
                "   9\n";

        String number = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);

            sb.append(digits[c - '0']).append("\n");
        }

        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
        }

        System.out.print(sb);
    }
}
