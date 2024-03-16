/*
 * BOJ 25600 Triathlon
 *
 * memory : 14676kb
 * time : 152ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25600 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int max = -1;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());

            int sum = 0;
            if (a == d + g) {
                sum = (a * (d + g)) * 2;
            } else {
                sum = a * (d + g);
            }

            if (max < sum)
                max = sum;
        }

        System.out.print(max);
    }
}
