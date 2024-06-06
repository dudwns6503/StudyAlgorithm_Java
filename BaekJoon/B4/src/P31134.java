/*
 * BOJ 31134 A Hero Named Magnus
 *
 * memory : 36460kb
 * time : 864ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P31134 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            long x = Integer.parseInt(br.readLine());

            long ans = 2 * x - 1;

            System.out.println(ans);
        }
    }
}
