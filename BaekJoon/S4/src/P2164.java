/*
 * BOJ 2164 카드2
 *
 * memory : 45332kb
 * time : 188ms
 */

import java.io.*;
import java.util.*;

/**
 *  queue를 이용하여 문제를 쉽게 풀 수 있었다.
 *
 *  q : 정수를 담는 Queue
 *  N : 1 ~ N 장의 카드를 나타내는 변수
 */
public class P2164 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<=N; i++) {
            q.offer(i);
        }

        // queue에 숫자 한개만 들어갔을 경우도 고려해야함.
        if(q.size() == 1) System.out.print(q.poll());
        else {
            while(true) {
                // 처음에 하나를 바닥에 버림.
                q.poll();

                // queue의 숫자 한개만 들어있다면 무한루프를 종료
                if(q.size() == 1) break;

                // 맨 앞에있는 것을 뽑아서 queue에 맨 뒤로 보냄.
                q.offer(q.poll());
            }

            // 마지막으로 queue에 남은 숫자를 뽑는다.
            System.out.print(q.poll());
        }
    }
}
