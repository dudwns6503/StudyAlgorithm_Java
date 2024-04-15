/*
 * BOJ 31636 三連続 (Three Consecutive)
 *
 * memory : 15520kb
 * time : 148ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P31636 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'o')
                count++;
            else
                count = 0;

            if (count == 3) {
                System.out.print("Yes");
                return;
            }
        }

        System.out.print("No");
    }
}
