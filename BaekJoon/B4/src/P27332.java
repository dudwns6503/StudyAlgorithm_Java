/*
 * BOJ 27332 11 月 (November)
 *
 * memory : 14196kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P27332 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if (a + 7 * b > 30) System.out.print(0);
        else System.out.print(1);
    }
}
