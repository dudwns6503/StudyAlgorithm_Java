/*
 * BOJ 31615 桁 (Digit)
 *
 * memory : 14248kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P31615 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        String sum = String.valueOf(a + b);

        System.out.print(sum.length());
    }
}
