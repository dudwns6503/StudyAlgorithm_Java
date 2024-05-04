/*
 * BOJ 24196 Gömda ord
 *
 * memory : 14084kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P24196 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String word = br.readLine();
        int count = 0;

        sb.append(word.charAt(0));
        count += word.charAt(0) - 'A';
        for (int i = 1; i < word.length(); i++) {
            if (count > 0) {
                count--;
                continue;
            }

            if (i == word.length() - 1) {
                sb.append(word.charAt(i));
            }
            else {
                count += word.charAt(i) - 'A';
                sb.append(word.charAt(i));
            }
        }

        System.out.print(sb);
    }
}
