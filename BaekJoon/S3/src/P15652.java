/*
 * BOJ 15652 N과 M(4)
 *
 * memory : 16276kb
 * time : 160ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15652 {
    static StringBuilder sb =new StringBuilder();

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

    // Recurrence Function (재귀 함수)
    // 만약 M 개를 전부 고름   => 조건에 맞는 탐색을 한 가지 성공한 것!
    // 아직 M 개를 고르지 않음 => k 번째부터 M번째 원소를 조건에 맞게 고르는 모든 방법을 시도한다.
    static void rec_func(int k) {
        if(k == M+1) { // 1 ~ M 번째를 전부 다 골랐다!
            // selected[1...M] 배열이 새롭게 탐색된 결과
            for(int i=1; i<=M; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        }
        else {
            int start = selected[k-1];
            if(start == 0) start = 1;
            for(int cand = start; cand<=N; cand++) {
                selected[k] = cand;
                rec_func(k+1);
                selected[k] = 0;
            }
        }
    }
}
