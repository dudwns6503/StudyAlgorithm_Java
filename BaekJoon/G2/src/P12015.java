/*
BaekJoon 12015 가장 긴 증가하는 부분수열 2

P11053 문제와 다르게 수열 A의 크기가 1,000,000까지라서 Brute-Force로 풀 경우 시간초과가 날 것이다. 그래서 이진 탐색을 기법을 사용하여
O(NlogN)의 시간으로 수행할 수 있도록 로직을 바꿔줘야 한다.
*/

import java.io.*;
import java.util.*;

public class P12015 {

    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        dp = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int LIS = 0;

        for(int i=0; i<N; i++) {
            int idx = BinearySearch(arr[i], 0, LIS, LIS+1);

            if(idx == -1) {
                dp[LIS++] = arr[i];
            } else {
                dp[idx] = arr[i];
            }
        }

        System.out.print(LIS);
    }

    private static int BinearySearch(int num, int start, int end, int size) {
        int res = 0;
        while(start <= end) {
            int mid = (start + end) / 2;

            if(num <= dp[mid]) {
                res = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        if(start == size) {
            return -1;
        } else {
            return res;
        }
    }
}