/*
 * BOJ 24568 Cupcake Party
 *
 * memory : 13980kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P24568 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int r = Integer.parseInt(br.readLine());
        int s = Integer.parseInt(br.readLine());

        System.out.print(r * 8 + s * 3 - 28);
    }
}
