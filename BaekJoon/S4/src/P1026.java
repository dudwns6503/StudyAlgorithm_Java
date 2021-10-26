/*
 * BOJ 1026 보물
 *
 * memory : 14284kb
 * time : 144ms
 */

import java.io.*;
import java.util.*;

/**
 *  그리디적 관점으로 한 쪽의 가장 큰 수와 다른 한 쪽의 가장 작은 수가 곱하게 되도록 하는 것이 포인트이다.
 *
 *  N : 주어지는 수의 개수
 *  A[] : 정수형 배열 A
 *  B[] : 정수형 배열 B이며, 이후에 내림차순 메소드를 사용하기 위해서 Ineger로 선언하였음.
 *
 */
public class P1026 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];

        // 내림차순 메소드를 사용하기 위해 Integer형으로 선언하였다.
        Integer[] B = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        // A는 오름차순, B는 내림차순으로 정렬한다.
        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());

        int ans = 0;

        // 가장 작은 숫자와 가장 큰 숫자가 곱해져서 최종적으로 합이 가장 작은 값이 정답이 된다.
        for(int i=0; i<N; i++) {
            ans += A[i] * B[i];
        }

        System.out.print(ans);
    }

}
