/*
 * BOJ 24294 ГРАДИНА
 *
 * memory : 14140kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P24294 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int w1 = Integer.parseInt(br.readLine());
        int h1 = Integer.parseInt(br.readLine());
        int w2 = Integer.parseInt(br.readLine());
        int h2 = Integer.parseInt(br.readLine());

        int ans = 2 * Math.max(w1, w2) + 2 * (h1 + h2) + 4;
        System.out.print(ans);
    }
}
