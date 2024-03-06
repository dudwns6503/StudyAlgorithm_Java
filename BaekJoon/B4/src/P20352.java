/*
 * BOJ 20352 Circus
 *
 * memory : 14300kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P20352 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long a = Long.parseLong(br.readLine());

        double r = Math.sqrt((double) a / Math.PI);
        System.out.println(2 * Math.PI * r);
    }
}
