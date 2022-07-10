/*
 * BOJ 15649 N과 M(1)
 *
 * memory : 23180kb
 * time : 312ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15649 {
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

    // 만약 M개를 전부 고름 -> 조건에 맞는 탐색을 한 가지 성공
    // M개를 고르지 않음 -> k번째부터 M번째 원소를 조건에 맞게 고르는 모든 방법을 시도.
    static void rec_func(int k) {
        if(k == M+1) {
            for(int i=1; i<=M; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        }
        else {
            for (int cand=1; cand <= N; cand++) {
                boolean isUsed = false;
                for(int j=1; j<k; j++) {
                    if(cand == selected[j])
                        isUsed = true;
                }

                if(!isUsed) {
                    selected[k] = cand;
                    rec_func(k+1);
                    selected[k] = 0;
                }
            }
        }
    }
}
