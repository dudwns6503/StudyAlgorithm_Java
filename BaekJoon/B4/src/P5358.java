/*
 * BOJ 5358 Football Team
 *
 * memory : 14212kb
 * time : 116ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5358 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String name = br.readLine();

            if (name == null) break;

            solve(name);
        }
    }

    private static void solve(String name) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch == 'i') {
                sb.append('e');
            } else if (ch == 'e') {
                sb.append('i');
            } else if (ch == 'I') {
                sb.append('E');
            } else if (ch == 'E') {
                sb.append('I');
            } else {
                sb.append(ch);
            }
        }

        System.out.println(sb);
    }
}
