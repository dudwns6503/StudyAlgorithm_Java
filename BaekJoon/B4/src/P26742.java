/*
 * BOJ 26742 Skarpetki
 *
 * memory : 20056kb
 * time : 260ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P26742 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        int bCount = 0;
        int cCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'B')
                bCount++;
            else
                cCount++;
        }

        System.out.print(bCount / 2 + cCount / 2);
    }
}
