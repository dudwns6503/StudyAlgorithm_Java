/*
 * BOJ 21335 Another Eruption
 *
 * memory : 14324kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P21335 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long a = Long.parseLong(br.readLine());

        double r = Math.sqrt(a / Math.PI);

        System.out.print(2 * Math.PI * r);
    }
}
