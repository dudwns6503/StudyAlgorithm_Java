/*
 * BOJ 13136 Do Not Touch Anything
 *
 * memory : 14140kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P13136 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(st.nextToken());

        int horizontal = r / n;
        int vertical = c / n;

        long sum = 0;
        if (r % n != 0)
            horizontal += 1;

        if (vertical <= 1) {
            System.out.print(horizontal);
        } else {
            if (c % n != 0)
                vertical += 1;

            sum = (long)horizontal * vertical;
            System.out.print(sum);
        }
    }
}