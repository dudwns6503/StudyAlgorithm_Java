/*
 * BOJ 10815 숫자 카드
 *
 * memory : 178340kb
 * time : 840ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10815 {

    static StringBuilder sb = new StringBuilder();

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] have = new int[20000001];

        for(int i=0; i<N; i++) {
            int index = Integer.parseInt(st.nextToken()) + 10000000;
            have[index] = 1;
        }

        int M = Integer.parseInt(br.readLine());

        int[] target = new int[M];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<M; i++) {
            target[i] = Integer.parseInt(st.nextToken());
            int index = target[i] + 10000000;

            if(have[index] != 0) {
                sb.append(1).append(" ");
            }
            else
                sb.append(0).append(" ");
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws Exception {

        input();
    }
}
