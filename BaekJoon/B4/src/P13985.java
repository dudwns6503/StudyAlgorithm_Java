/*
 * BOJ 13985 Equality
 *
 * memory : 14176kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P13985 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] word = br.readLine().split(" ");

        long a = Long.parseLong(word[0]);
        long b = Long.parseLong(word[2]);

        long c = Long.parseLong(word[4]);

        if (a + b == c)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
