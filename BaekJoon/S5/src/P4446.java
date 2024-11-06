/*
 * BOJ 4446 ROT13
 *
 * memory : 14144kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P4446 {

    private static String str;
    private static Character[] lowerVowels = {'a', 'i', 'y', 'e', 'o', 'u'};
    private static Character[] upperVowels = {'A', 'I', 'Y', 'E', 'O', 'U'};
    private static Character[] lowerConsonants = {'b', 'k', 'x', 'z', 'n', 'h', 'd', 'c', 'w', 'g', 'p', 'v', 'j', 'q', 't', 's', 'r', 'l', 'm', 'f'};
    private static Character[] upperConsonants = {'B', 'K', 'X', 'Z', 'N', 'H', 'D', 'C', 'W', 'G', 'P', 'V', 'J', 'Q', 'T', 'S', 'R', 'L', 'M', 'F'};

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isAlphabetic(ch)) {
                // 모음이라면
                for (int j = 0; j < 6; j++) {
                    if (lowerVowels[j] == ch) {
                        sb.append(lowerVowels[(j + 3) % 6]);
                        break;
                    } else if (upperVowels[j] == ch) {
                        sb.append(upperVowels[(j + 3) % 6]);
                        break;
                    }
                }
                // 자음이라면
                for (int j = 0; j < 20; j++) {
                    if (lowerConsonants[j] == ch) {
                        sb.append(lowerConsonants[(j + 10) % 20]);
                        break;
                    } else if (upperConsonants[j] == ch) {
                        sb.append(upperConsonants[(j + 10) % 20]);
                        break;
                    }
                }
            }
            else {
                sb.append(ch);
            }
        }

        System.out.println(sb);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while ((str = br.readLine()) != null) {
            solve();
        }
    }
}
