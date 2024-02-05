/*
 * BOJ 31306 Is Y a Vowel?
 *
 * memory : 15924kb
 * time : 144ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P31306 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        int yCount = 0;
        int vowelCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vowelCount++;

            if (c == 'y')
                yCount++;
        }

        System.out.print(vowelCount + " " + (vowelCount + yCount));
    }
}
