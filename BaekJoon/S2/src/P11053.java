/*
BaekJoon 11053 가장 긴 증가하는 부분수열

최장 증가 부분 수열(LIS): 원소가 N개인 배열의 일부 원소를 골라내서 만든 부분 수열 중, 각 원소가 이전 원소보다 크다는 조건을 만족하고,
                       그 길이가 최대인 부분 수열을 최장 증가 부분 수열이라고 한다.
Brute-Force방식으로 O(n^2)의 시간의 수행시간을 가진 문제 풀이이며 이 문제에서는 원소의 개수가 1000개 이하이므로 사용할 수 있다.
원소가 너무 많아서 Brute-Force 방식으로 해결하기 어렵다면... -> DP를 활용하여 해결
*/

import java.io.*;
import java.util.*;

public class P11053 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        int[] LIS = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;

        for(int i=0; i<N; i++) {
            LIS[i] = 1;
            for(int j=0; j<i; j++) {
                if(arr[i] > arr[j] && LIS[j] + 1 > LIS[i])
                   LIS[i] = 1 + LIS[j];
            }
            if(max < LIS[i])
                max = LIS[i];
        }

        System.out.print(max);
    }
}
