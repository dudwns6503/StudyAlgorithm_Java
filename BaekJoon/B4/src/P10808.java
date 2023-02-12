/*
 * BOJ 10808 알파벳 개수
 *
 * memory : 14180kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10808 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        int[] alphabetCnt = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char alphabet = str.charAt(i);

            alphabetCnt[alphabet - 'a']++;
        }

        for (int cnt : alphabetCnt) {
            sb.append(cnt).append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
