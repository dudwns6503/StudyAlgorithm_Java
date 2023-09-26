/*
 * BOJ 30045 ZOAC 6
 *
 * memory : 15972kb
 * time : 152ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P30045 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < n; i++) {
            String post = br.readLine();

            if (post.contains("01") || post.contains("OI")) count++;
        }

        System.out.print(count);
    }
}
