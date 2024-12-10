/*
 * BOJ 32642 당구 좀 치자 제발
 *
 * memory : 29204kb
 * time : 272ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P32642 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long anger = 0;
        long angerSum = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(st.nextToken()) == 1)
                angerSum += ++anger;
            else
                angerSum += --anger;
        }

        System.out.print(angerSum);
    }
}
