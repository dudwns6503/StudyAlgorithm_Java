/*
 * BOJ 23235 The Fastest Sorting Algorithm In The World
 *
 * memory : 14436kb
 * time : 148ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P23235 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int cnt = 1;
        while (true) {
            st = new StringTokenizer(br.readLine());

            if (Integer.parseInt(st.nextToken()) == 0)
                break;
            else
                System.out.println("Case " + cnt++ + ": Sorting... done!");
        }
    }
}
