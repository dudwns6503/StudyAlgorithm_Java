/*
 * BOJ 18258 큐2
 */

import java.io.*;
import java.util.StringTokenizer;

/**
 *  queue를 직접 구현하는 방식으로 하였다.
 *  q : queue를 나타내는 정수형 배열이며, 명령의 총 개수만큼 크기를 잡아주었다.
 *  front : queue의 앞 부분을 가리키는 변수
 *  back : queue의 뒷 부분을 가리키는 변수
 *  size : queue가 값을 가지고 있는 만큼 증가하는 변수
 */
public class P18258 {

    static int[] q = new int[2000000];

    static int front = 0;
    static int back = 0;
    static int size = 0;

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        while(N-- > 0) {
            // stringTokenizer로 문자열을 공백을 기준으로 분리하였다.
            st = new StringTokenizer(br.readLine(), " ");

            // switch문으로 명령을 분기하였다.
            switch(st.nextToken()) {
                case "push" : push(Integer.parseInt(st.nextToken())); break;
                case "pop" : pop(); break;
                case "size" : size(); break;
                case "empty" : empty(); break;
                case "front" : front(); break;
                case "back" : back(); break;
            }
        }

        System.out.println(sb);
    }

    private static void push(int n) {
        q[back++] = n;
        size++;
    }

    private static void pop() {
        if(size == 0) {
            sb.append(-1).append("\n");
        }
        else {
            sb.append(q[front]).append("\n");
            size--;
            front++;
        }
    }

    private static void size() {
        sb.append(size).append("\n");
    }

    private static void empty() {
        if(size == 0) {
            sb.append(1).append("\n");
        } else {
            sb.append(0).append("\n");
        }
    }

    private static void front() {
        if(size == 0) {
            sb.append(-1).append("\n");
        } else {
            sb.append(q[front]).append("\n");
        }
    }

    private static void back() {
        if(size == 0) {
            sb.append(-1).append("\n");
        } else {
            sb.append(q[back-1]).append("\n");
        }
    }

}
