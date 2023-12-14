/*
 * BOJ 6888 Terms of Office
 *
 * memory : 14088kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P6888 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        while (x <= y) {
            sb.append("All positions change in year ").append(x).append("\n");

            x += 60;
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
