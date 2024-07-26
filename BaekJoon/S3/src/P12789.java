/*
 * BOJ 12789 도키도키 간식드리미
 *
 * memory : 14348kb
 * time : 136ms
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P12789 {

    private static int[] a;
    private static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void solve() {
        Stack<Integer> stack = new Stack<>();

        int findNum = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] != findNum) {
                if (!stack.isEmpty()) {
                    int num = stack.peek();
                    if (num == findNum) {
                        stack.pop();
                        findNum++;
                        i--;
                    } else {
                        stack.add(a[i]);
                    }
                } else {
                    stack.add(a[i]);
                }
            } else {
                findNum++;
            }
        }

        while (!stack.isEmpty()) {
            int first = stack.pop();

            if (!stack.isEmpty()) {
                int next = stack.peek();

                if (next != first + 1) break;
            }
        }
        if (!stack.isEmpty())
            System.out.print("Sad");
        else
            System.out.print("Nice");
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        a = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
    }
}
