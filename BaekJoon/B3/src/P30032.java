/*
 * BOJ 30032 알파벳 뒤집기
 *
 * memory : 14264kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P30032 {

    private static String[] alphabets = {"p", "b", "q", "d"};
    private static int n, d;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            bw.write(solve(br.readLine()));
        }

        bw.flush();
        bw.close();
    }

    private static String solve(String word) {
        if (d == 1)
            word = upDownReverse(word);
        else
            word = leftRightReverse(word);

        return word;
    }

    private static String upDownReverse(String word) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < 4; j++) {
                String comparedAlphabet = alphabets[j];

                if (comparedAlphabet.equals(String.valueOf(word.charAt(i)))) {
                    if (j % 2 == 0) {
                        sb.append(alphabets[j + 1]);
                    } else  {
                        sb.append(alphabets[j - 1]);
                    }
                    break;
                }
            }
        }

        return sb.append("\n").toString();
    }

    private static String leftRightReverse(String word) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < 4; j++) {
                String comparedAlphabet = alphabets[j];

                if (comparedAlphabet.equals(String.valueOf(word.charAt(i)))) {
                    if (j < 2) {
                        sb.append(alphabets[j + 2]);
                    } else  {
                        sb.append(alphabets[j - 2]);
                    }
                    break;
                }
            }
        }

        return sb.append("\n").toString();
    }
}
