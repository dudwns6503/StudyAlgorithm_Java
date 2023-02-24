/*
 * BOJ 9086 문자열
 *
 * memory : 14156kb
 * time : 120ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P9086 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            String head = str.substring(0, 1);
            String tail = str.substring(str.length() - 1);

            System.out.println(head+tail);
        }
    }
}
