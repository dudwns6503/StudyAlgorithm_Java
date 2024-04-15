/*
 * BOJ 31616 揃った文字 (Matched Letters)
 *
 * memory : 14216kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P31616 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String word = br.readLine();

        char first = word.charAt(0);
        for (int i = 1; i < n; i++) {
            if (first != word.charAt(i)) {
                System.out.print("No");
                return;
            }
        }

        System.out.print("Yes");
    }
}
