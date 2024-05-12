/*
 * BOJ 21633 Bank Transfer
 *
 * memory : 14584kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P21633 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        double charge = 25 + k / 100.0;

        if (charge < 100)
            charge = 100;
        else if (charge > 2000)
            charge = 2000;

        System.out.printf("%.2f", charge);
    }
}
