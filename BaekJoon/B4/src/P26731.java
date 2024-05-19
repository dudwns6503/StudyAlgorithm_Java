/*
 * BOJ 26731 Zagubiona litera
 *
 * memory : 14248kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P26731 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (char i = 'A'; i <= 'Z'; i++) {
            if (!str.contains(String.valueOf(i)))
                System.out.print(i);
        }
    }
}
