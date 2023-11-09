/*
 * BOJ 27331 2 桁の整数 (Two-digit Integer)
 *
 * memory : 14144kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P27331 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.print(10 * a + b);
    }
}
