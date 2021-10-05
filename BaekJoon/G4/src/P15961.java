/*
 * BOJ 15961 회전 초밥
 */

import java.util.*;
import java.io.*;

public class P15961 {

    /*
     * sushi : 사용자에게 입력받는 초밥을 저장하는 1차원 정수형 배열
     * eat : 먹은 초밥을 나타낼 1차원 정수형 배열
     * N : 접시의 수
     * d : 초밥의 가짓 수
     * k : 연속해서 먹는 접시의 수
     * c : 쿠폰 번호
     */
    static int[] sushi;
    static int[] eat;
    static int N, d, c, k;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        sushi = new int[N]; // 입력받는 초밥
        eat = new int[d+1]; // 초밥 종류

        for(int i=0; i<N; i++) {
            sushi[i] = Integer.parseInt(br.readLine());
        }

        System.out.print(solve());
    }

    private static int solve() {
        /*
         * sushiKinds : 먹을 수 있는 초밥의 가짓 수를 저장하는 변수
         * ans : 먹을 수 있는 초밥의 최댓값을 저장하는 변수
         */
        int sushiKinds = 0;
        int ans = 0;

        for(int i=0; i<k; i++) {
            int sushiNumber = sushi[i];
            if(eat[sushiNumber]==0) sushiKinds++; // 처음 먹은 초밥이라면 먹은 초밥의 종류 증가

            eat[sushiNumber]++; // 해당 번호의 초밥 개수 증가
        }

        ans = sushiKinds;

        // 왼쪽부터 처리하며 하나씩 제외시키고 오른쪽 초밥을 포함시킨다.
        for(int i=1; i<N; i++) {
            // 왼쪽 초밥 제외
            int left = sushi[i-1];
            eat[left]--;
            if(eat[left] == 0) sushiKinds--;

            // 오른쪽 초밥 포함
            int right = (i+k-1)%N;
            int sushi_no = sushi[right];

            if(eat[sushi_no] == 0) sushiKinds++;

            eat[sushi_no]++;

            // 먹은 종류가 이전의 최댓값 이상인 경우 쿠폰을 반영해서 ans에 저장한다.
            if(ans <= sushiKinds) {
                if(eat[c] == 0) { // 쿠폰에 쓰여있는 초밥을 안먹었다면 먹을 수 있는 초밥의 가짓 수 +1
                    ans = sushiKinds + 1;
                } else {
                    ans = sushiKinds;
                }
            }
        }

        return ans;
    }
}