/*
 * BOJ 26489 Gum Gum for Jay Jay
 *
 * memory : 14116kb
 * time : 116ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P26489 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ans = 0;
        while (true) {
            String str = br.readLine();

            if (str == null) break;

            ans++;
        }

        System.out.print(ans);
    }
}
