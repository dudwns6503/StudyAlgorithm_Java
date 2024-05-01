/*
 * BOJ 31775 글로벌 포닉스
 *
 * memory : 14248kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P31775 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean l = false;
        boolean k = false;
        boolean p = false;

        for (int i = 0; i < 3; i++) {
            String s = br.readLine();

            if (s.startsWith("l"))
                l = true;
            else if (s.startsWith("k"))
                k = true;
            else if (s.startsWith("p"))
                p = true;
        }

        if (l && k && p)
            System.out.print("GLOBAL");
        else
            System.out.print("PONIX");
    }
}
