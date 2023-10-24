/*
 * BOJ 28927 Киноманы
 *
 * memory : 14188kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P28927 {

    private static int[] min;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        min = new int[2];
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());

            int t = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int f = Integer.parseInt(st.nextToken());

            min[i] = t * 3 + e * 20 + f * 120;
        }

        if (min[0] == min[1])
            System.out.print("Draw");
        else if (min[0] > min[1])
            System.out.print("Max");
        else
            System.out.print("Mel");
    }
}
