/*
 * BOJ 5717 상근이의 친구들
 *
 * memory : 14160kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5717 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());

            int manFriend = Integer.parseInt(st.nextToken());
            int girlFriend = Integer.parseInt(st.nextToken());

            if (manFriend == 0 && girlFriend == 0) break;
            sb.append(manFriend + girlFriend).append("\n");
        }

        System.out.print(sb);
    }

}
