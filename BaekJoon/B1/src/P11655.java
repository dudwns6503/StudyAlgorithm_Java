/*
 * BOJ 11655 ROT13
 *
 * memory : 14336kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11655 {

    private static String s;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isAlphabetic(c)) {
                if (Character.isLowerCase(c)) {
                    c += 13;
                    if (c > 'z')
                        c -= 26;
                }
                else {
                    c += 13;
                    if (c > 'Z')
                        c -= 26;
                }

                sb.append(c);
            }
            else {
                sb.append(c);
            }
        }

        System.out.print(sb);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        s = br.readLine();
    }
}
