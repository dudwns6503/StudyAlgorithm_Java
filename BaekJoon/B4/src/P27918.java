/*
 * BOJ 27918 탁구 경기
 *
 * memory : 23336kb
 * time : 240ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P27918 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int x = 0, y = 0;

        for (int i = 0; i < n; i++) {
            String winnerName = br.readLine();

            if (winnerName.equals("D")) x++;
            else y++;

            if (Math.abs(x - y) == 2) break;
        }

        System.out.print(x + ":" + y);
    }
}
