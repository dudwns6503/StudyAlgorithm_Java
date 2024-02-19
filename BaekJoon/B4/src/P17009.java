/*
 * BOJ 17009 Winning Score
 *
 * memory : 14244kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P17009 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a3 = Integer.parseInt(br.readLine());
        int a2 = Integer.parseInt(br.readLine());
        int a1 = Integer.parseInt(br.readLine());

        int b3 = Integer.parseInt(br.readLine());
        int b2 = Integer.parseInt(br.readLine());
        int b1 = Integer.parseInt(br.readLine());

        int sumA = 0;
        int sumB = 0;

        sumA += a3 * 3 + a2 * 2 + a1;
        sumB += b3 * 3 + b2 * 2 + b1;

        if (sumA == sumB)
            System.out.print("T");
        else {
            if (sumA > sumB)
                System.out.print("A");
            else
                System.out.print("B");
        }
    }
}
