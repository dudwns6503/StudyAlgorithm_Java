/*
 * BOJ 27866 문자와 문자열
 *
 * memory : 14140kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P27866 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int i = Integer.parseInt(br.readLine());

        System.out.print(word.charAt(i - 1));
    }
}
