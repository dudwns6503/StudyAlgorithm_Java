/*
 * BOJ 29340 Отряд
 *
 * memory : 14196kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P29340 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        String ans = "";
        for (int i = 0; i < a.length(); i++) {
            int numA = a.charAt(i) - '0';
            int numB = b.charAt(i) - '0';

            if (numA > numB)
                ans += String.valueOf(numA);
            else
                ans += String.valueOf(numB);
        }

        System.out.print(ans);
    }
}
