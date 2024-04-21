/*
 * BOJ 31520 Champernowne Verification
 *
 * memory : 14160kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P31520 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();

        if (n.length() == 10) {
            System.out.print("-1");
            return;
        }

        int k = 1;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) - '0' != k) {
                System.out.print("-1");
                return;
            }
            k++;
        }

        System.out.print(--k);
    }
}
