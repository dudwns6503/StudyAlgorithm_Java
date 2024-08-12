/*
 * BOJ 10820 문자열 분석
 *
 * memory : 14296kb
 * time : 112ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10820 {

    private static StringBuilder sb;
    private static int lowerCnt, upperCnt, numericCount, blankCount;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void solve(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isAlphabetic(c)) {
                if (Character.isUpperCase(c))
                    upperCnt++;
                else
                    lowerCnt++;
            }
            else if (Character.isDigit(c)) {
                numericCount++;
            } else {
                blankCount++;
            }
        }

        sb.append(lowerCnt).append(' ').append(upperCnt).append(' ').append(numericCount).append(' ').append(blankCount).append("\n");
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while ((str = br.readLine()) != null) {
            sb = new StringBuilder();
            lowerCnt = 0;
            upperCnt = 0;
            numericCount = 0;
            blankCount = 0;
            solve(str);
            System.out.print(sb);
        }
    }
}
