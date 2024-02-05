/*
 * BOJ 30793 gahui and sousenkyo 3
 *
 * memory : 14200kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P30793 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int px = Integer.parseInt(st.nextToken());
        int rx = Integer.parseInt(st.nextToken());

        double vx = (double) px / rx;
        if (vx < 0.2)
            System.out.print("weak");
        else if (vx < 0.4)
            System.out.print("normal");
        else if (vx < 0.6)
            System.out.print("strong");
        else
            System.out.print("very strong");
    }
}
