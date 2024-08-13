/*
 * BOJ 1406 에디터
 *
 * memory : 124016kb
 * time : 676ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P1406 {

    private static StringBuilder sb = new StringBuilder();
    private static Stack<String> leftStack = new Stack<>();
    private static Stack<String> rightStack = new Stack<>();
    private static String str;
    private static int n, m;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void solve(String order, String word) {
        // order가 P인 경우
        leftStack.push(word);
    }

    private static void solve(String order) {
        // P가 아닌 나머지
        if (order.equals("L")) {
            if (!leftStack.isEmpty())
                rightStack.push(leftStack.pop());
        } else if (order.equals("D")) {
            if (!rightStack.isEmpty())
                leftStack.push(rightStack.pop());
        } else {
            if (!leftStack.isEmpty())
                leftStack.pop();
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        str = br.readLine();

        n = str.length();

        m = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            leftStack.push(String.valueOf(str.charAt(i)));
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            String order = st.nextToken();
            if (order.equals("P")) {
                String word = st.nextToken();

                solve(order, word);
            }
            else {
                solve(order);
            }
        }

        // for문 쓰면 안됨. size가 계속 작아지기 때문에 탐색하지 못하는 원소가 생긴다.
        while (!leftStack.isEmpty()) {
            sb.append(leftStack.pop());
        }

        sb.reverse();

        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }

        System.out.print(sb);
    }
}
