/*
 * BOJ 2083 럭비 클럽
 *
 * memory : 14116kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2083 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            if (name.equals("#") && age == 0 && weight == 0) {
                break;
            }

            sb.append(name).append(" ");
            if (age > 17 || weight >= 80) sb.append("Senior");
            else sb.append("Junior");

            sb.append("\n");
        }

        if (sb.length() >= 1) sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
