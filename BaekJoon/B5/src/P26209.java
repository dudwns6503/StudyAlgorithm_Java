/*
 * BOJ 26209 Intercepting Information
 *
 * memory : 14184kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P26209 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            if (Integer.parseInt(st.nextToken()) == 9) {
                sb.append("F");
                break;
            }
        }

        if (sb.length() == 0)
            sb.append("S");

        System.out.print(sb);
    }
}
