/*
 * BOJ 21612 Boiling Water
 *
 * memory : 14096kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P21612 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int BELOW_SEA_LEVEL = -1;
        final int SURFACE_OF_THE_SEA = 0;
        final int ABOVE_THE_SEA_LEVEL = 1;

        int b = Integer.parseInt(br.readLine());

        int p = 5 * b - 400;

        System.out.println(p);

        if (p == 100) {
            System.out.print(SURFACE_OF_THE_SEA);
        } else if (p < 100) {
            System.out.print(ABOVE_THE_SEA_LEVEL);
        } else {
            System.out.print(BELOW_SEA_LEVEL);
        }
    }
}
