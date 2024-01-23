/*
 * BOJ 14065 Gorivo
 *
 * memory : 14596kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P14065 {

    private static final double LITER = 3.785411784;
    private static final double MILE = 1.609344;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double x = Double.parseDouble(br.readLine());

        System.out.printf("%6f", 100.0 / ((MILE / LITER) * x));
    }
}
