/*
 * BOJ 27855 Cornhole
 *
 * memory : 14628kb
 * time : 140ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P27855 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h1 = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int h2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        int sum1 = h1 * 3 + b1;
        int sum2 = h2 * 3 + b2;

        if (sum1 == sum2)
            System.out.print("NO SCORE");
        else if (sum1 > sum2)
            System.out.print("1 " + (sum1 - sum2));
        else
            System.out.print("2 " + (sum2 - sum1));
    }
}
