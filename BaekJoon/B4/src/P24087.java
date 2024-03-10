/*
 * BOJ 24087 アイスクリーム (Ice Cream)
 *
 * memory : 14156kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P24087 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int s = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int sum = 250;

        while (s > a) {
            sum += 100;
            a += b;
        }

        System.out.print(sum);
    }
}
