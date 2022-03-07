/*
 * BOJ 14888 연산자 끼워넣기
 *
 * memory : 18024kb
 * time : 228ms
 */

import java.util.*;

/**
 *  연산자 끼워넣기(이코테)
 *
 *  N: 수의 개수(2 <= N <= 11)
 *  arr : N개의 수로 이루어진 수열(1 <= arr(i) <= 100)
 *  x: 수열에 들어갈 수
 *  plus: 더하기 개수
 *  minus: 빼기 개수
 *  multiply: 곱하기 개수
 *  div: 나누기 개수
 *
 *  어떻게 풀었는가 & 이 문제로 무엇을 배웠는가
 *  중복 순열문제로 DFS를 이용하여 풀었다.
 */

public class P14888 {

    public static ArrayList<Integer> arr = new ArrayList<>();
    public static int N, plus, minus, multiply, div;

    public static int minValue = (int) 1e9;
    public static int maxValue = (int) -1e9;

    // 중복 순열 형태
    public static void dfs(int i, int now) {
        // 연산자를 다 넣었을 경우, 최솟값과 최댓값을 갱신한다.
        if(i == N) {
            minValue = Math.min(minValue, now);
            maxValue = Math.max(maxValue, now);
        }
        else {
            if(plus > 0) {
                plus -= 1;
                dfs(i+1, now + arr.get(i));
                plus += 1;
            }
            if(minus > 0) {
                minus -= 1;
                dfs(i+1, now - arr.get(i));
                minus += 1;
            }
            if(multiply > 0) {
                multiply -= 1;
                dfs(i+1, now * arr.get(i));
                multiply += 1;
            }
            if(div > 0) {
                div -= 1;
                dfs(i+1, now / arr.get(i));
                div += 1;
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        for(int i=0; i<N; i++) {
            int x = sc.nextInt();
            arr.add(x);
        }

        plus = sc.nextInt();
        minus = sc.nextInt();
        multiply = sc.nextInt();
        div = sc.nextInt();

        dfs(1, arr.get(0));

        System.out.println(maxValue);
        System.out.println(minValue);



    }
}
