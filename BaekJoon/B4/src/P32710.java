/*
 * BOJ 32710 구구단표
 *
 * memory : 14216kb
 * time : 108ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P32710 {
    
    public static void main(String[] args) throws Exception {
        input();
    }
    
    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        boolean[] number = new boolean[101];
        number[1] = true;
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                number[i * j] = true;
            }
        }

        if (number[n])
            System.out.print("1");
        else
            System.out.print("0");

    }
}
