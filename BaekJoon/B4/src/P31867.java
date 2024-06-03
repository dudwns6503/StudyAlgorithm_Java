/*
 * BOJ 31867 홀짝홀짝
 *
 * memory : 20012kb
 * time : 260ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P31867 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String k = br.readLine();

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            int num = k.charAt(i) - '0';

            if (num % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        if (evenCount > oddCount)
            System.out.print("0");
        else if (evenCount < oddCount)
            System.out.print("1");
        else
            System.out.print("-1");
    }
}
