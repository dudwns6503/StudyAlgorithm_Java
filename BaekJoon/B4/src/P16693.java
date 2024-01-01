/*
 * BOJ 16693 Pizza Deal
 *
 * memory : 14248kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P16693 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int p1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int r1 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());

        if ((double) a1 / p1 < Math.PI * (double) r1 * r1 / p2)
            System.out.print("Whole pizza");
        else
            System.out.print("Slice of pizza");
    }
}
