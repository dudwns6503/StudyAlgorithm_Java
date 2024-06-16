/*
 * BOJ 31495 그게 무슨 코드니..
 *
 * memory : 14076kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P31495 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        if (!s.startsWith("\"") || !s.endsWith("\"")) {
            System.out.print("CE");
        }
        else {
            if (s.length() <= 2)
                System.out.print("CE");
            else
                System.out.print(s.substring(1, s.length() - 1));
        }
    }
}
