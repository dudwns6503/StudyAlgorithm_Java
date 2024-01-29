/*
 * BOJ 15128 Congruent Numbers
 *
 * memory : 14204kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15128 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long p1 = Integer.parseInt(st.nextToken());
        long q1 = Integer.parseInt(st.nextToken());
        long p2 = Integer.parseInt(st.nextToken());
        long q2 = Integer.parseInt(st.nextToken());

        boolean isInteger = (p1 * p2 % (q1 * q2 * 2) == 0);

        if (isInteger)
            System.out.print(1);
        else
            System.out.print(0);
    }
}
