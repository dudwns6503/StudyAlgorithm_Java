/*
 * BOJ 8558 Silnia
 *
 * memory : 14116kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P8558 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n == 0 || n == 1)
            System.out.print(1);
        else if (n == 2)
            System.out.print(2);
        else if (n == 3)
            System.out.print(6);
        else if (n == 4)
            System.out.print(4);
        else
            System.out.print(0);
    }
}
