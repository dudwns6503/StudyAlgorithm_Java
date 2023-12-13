/*
 * BOJ 6887 Squares
 *
 * memory : 14620kb
 * time : 140ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P6887 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double tiles = Double.parseDouble(br.readLine());

        System.out.print("The largest square has side length " + (int)Math.floor(Math.sqrt(tiles)) + ".");
    }
}
