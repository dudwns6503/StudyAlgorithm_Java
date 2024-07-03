/*
 * BOJ 25991 Lots of Liquid
 *
 * memory : 65896kb
 * time : 556ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25991 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        double sum = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            sum += Math.pow(Double.parseDouble(st.nextToken()), 3);
        }

        System.out.println(Math.cbrt(sum));
    }
}
