/*
 * BOJ 3765 Celebrity jeopardy
 *
 * memory : 13988kb
 * time : 116ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P3765 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();

            if (str == null) break;

            sb.append(str).append('\n');
        }

        System.out.print(sb);
    }
}
