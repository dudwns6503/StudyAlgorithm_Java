/*
 * BOJ 1406 에디터
 *
 * memory : 126396kb
 * time : 796ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P1406 {

    private static StringBuilder sb1 = new StringBuilder();
    private static StringBuilder sb2 = new StringBuilder();
    private static Stack<String> stack1 = new Stack<>();
    private static Stack<String> stack2 = new Stack<>();

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String[] strings = br.readLine().split("");

        for (int i = 0; i < strings.length; i++) {
            stack1.push(strings[i]);
        }

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            String order = st.nextToken();

            if (order.equals("L")) {
                cursorLeft();
            } else if (order.equals("D")) {
                cursorRight();
            } else if (order.equals("B")) {
                removeCharacter();
            } else {
                String character = st.nextToken();
                addCharacter(character);
            }
        }

        solve();
    }

    // Stack이 비어있는지 체크를 먼저 해주어야 한다.
    private static void cursorLeft() {
        if (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }

    private static void cursorRight() {
        if (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    private static void removeCharacter() {
        if (!stack1.isEmpty()) {
            stack1.pop();
        }
    }

    private static void addCharacter(String character) {
        stack1.push(character);
    }

    private static void solve() {
        // Stack1에 있는 원소들은 sb1에 Stack2 원소들은 sb2에 담았다.
        while (!stack1.isEmpty()) {
            sb1.append(stack1.pop());
        }

        while (!stack2.isEmpty()) {
            sb2.append(stack2.pop());
        }

        // Stack1은 역순으로 출력하여야 한다.
        sb1.reverse();
        sb1.append(sb2);
        System.out.print(sb1);
    }
}
