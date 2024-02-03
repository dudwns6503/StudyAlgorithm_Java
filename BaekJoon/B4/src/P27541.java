/*
 * BOJ 27541 末尾の文字 (Last Letter)
 *
 * memory : 14260kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P27541 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String word = br.readLine();

        if (word.charAt(N - 1) == 'G')
            System.out.print(word.substring(0, N - 1));
        else
            System.out.print(word + "G");
    }
}
