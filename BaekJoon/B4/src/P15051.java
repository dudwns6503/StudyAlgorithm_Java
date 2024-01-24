/*
 * BOJ 15051 Máquina de café
 *
 * memory : 14116kb
 * time : 116ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P15051 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a1 = Integer.parseInt(br.readLine());
        int a2 = Integer.parseInt(br.readLine());
        int a3 = Integer.parseInt(br.readLine());

        int sum1 = (2*a1 + a2) * 2;
        int sum2 = (a2 + 2*a3) * 2;
        int sum3 = (a1 + a3) * 2;

        System.out.print(Math.min(sum1, Math.min(sum2, sum3)));
    }
}
