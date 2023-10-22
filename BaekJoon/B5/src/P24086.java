/*
 * BOJ 24086 身長 (Height)
 *
 * memory : 14120kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P24086 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.print(b - a);
    }
}
