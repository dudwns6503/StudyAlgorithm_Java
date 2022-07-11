/*
 * BOJ 15651 N과 M(3)
 *
 * memory : 67992kb
 * time : 480ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15651 {
    static StringBuilder sb = new StringBuilder();

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        selected = new int[M+1];

    }

    static int N, M;
    static int[] selected;

    public static void main(String[] args) throws Exception {

        input();

        rec_func(1);

        System.out.println(sb.toString());
    }

    static void rec_func(int k) {
        if(k == M+1) {
            for(int i=1; i<=M; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        }
        else {
            for(int cand=1; cand<=N; cand++) {
                selected[k] = cand;
                rec_func(k+1);
                selected[k] = 0;
            }
        }
    }
}
