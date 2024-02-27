/*
 * BOJ 18691 Pokemon Buddy
 *
 * memory : 14108kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P18691 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());

            int g = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            if (e - c <= 0)
                System.out.println(0);
            else if (g == 1) {
                System.out.println(e - c);
            } else if (g == 2) {
                System.out.println((e - c) * 3);
            } else {
                System.out.println((e - c) * 5);
            }
        }
    }
}
