/*
 * BOJ 15059 Hard choice
 *
 * memory : 14196kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15059 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int c1 = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());
        int a1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int c2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());

        int sum = 0;
        if (c1 < c2)
            sum += c2 - c1;
        if (b1 < b2)
            sum += b2 - b1;
        if (a1 < a2)
            sum += a2 - a1;

        System.out.print(sum);
    }
}
