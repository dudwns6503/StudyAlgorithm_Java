/*
 * BOJ 10987 모음의 개수
 *
 * memory : 14224kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10987 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }

        System.out.print(count);
    }
}
