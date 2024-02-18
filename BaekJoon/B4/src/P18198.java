/*
 * BOJ 18198 Basketball One-on-One
 *
 * memory : 14052kb
 * time : 116ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P18198 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String game = br.readLine();

        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < game.length() - 1; i+=2) {
            char player = game.charAt(i);
            int score = game.charAt(i + 1) - '0';

            if (player == 'A')
                sumA += score;
            else
                sumB += score;
        }

        if (sumA > sumB)
            System.out.print("A");
        else
            System.out.print("B");
    }
}
