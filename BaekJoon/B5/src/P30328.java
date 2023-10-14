/*
 * BOJ 30328 Java Warriors
 *
 * memory : 14176kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P30328 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.print(n * 4000);
    }
}
