/*
 * BOJ 30017 치즈버거 만들기
 *
 * memory : 14208kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P30017 {

    private static int patty, cheese;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        patty = Integer.parseInt(st.nextToken());
        cheese = Integer.parseInt(st.nextToken());

        solve();
    }

    private static void solve() {
        // 0은 패티, 1은 치즈
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        stack.add(1);
        stack.add(0);

        patty -= 2;
        cheese -= 1;
        int size = 3;

        while (true) {
            // 재료의 맨 위가 패티이고, 치즈 갯수가 0개가 아닐 때
            if (stack.peek() == 0 && cheese != 0) {
                if (patty != 0) {
                    cheese -= 1;
                    size += 1;
                    stack.add(1);
                }
                // 패티가 0이라면 치즈가 맨위재료가 되므로 안된다. break
                else {
                    break;
                }
            } else if (stack.peek() == 1 && patty != 0) {
                patty -= 1;
                size += 1;
                stack.add(0);
            } else {
                break;
            }
        }

        System.out.print(size);
    }
}
