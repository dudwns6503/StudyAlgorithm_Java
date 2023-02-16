/*
 * BOJ 17298 오큰수
 *
 * memory : 144520kb
 * time : 1000ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P17298 {

    private static StringBuilder sb = new StringBuilder();
    // index를 저장하는 스택
    private static Stack<Integer> stack = new Stack<>();
    private static int[] a;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        a = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void solve() {
        for (int i = 0; i < n; i++) {
            // 오큰수 조건
            while (!stack.isEmpty() && a[i] > a[stack.peek()]) {
                a[stack.pop()] = a[i];
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            a[stack.pop()] = -1;
        }

        for (int i = 0; i < n; i++) {
            sb.append(a[i]).append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
