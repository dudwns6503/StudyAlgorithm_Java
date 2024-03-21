/*
 * BOJ 26736 Wynik meczu
 *
 * memory : 15668kb
 * time : 156ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P26736 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A')
                sumA++;
            else
                sumB++;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sumA).append(" : ").append(sumB);

        System.out.print(sb);
    }
}
