/*
 * BOJ 10828 스택
 *
 * memory : 18688kb
 * time : 388ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P10828 {

    public static void main(String[] args) throws IOException {
        inputAndSolve();
    }

    static void inputAndSolve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        ArrayList<Integer> stack = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        String order;
        int x = 0;
        int current = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            order = st.nextToken();

            if (order.equals("push")) {
                x = Integer.parseInt(st.nextToken());
                stack.add(x);
                current++;
            } else if (order.equals("pop")) {
                if (current == 0) {
                    System.out.println("-1");
                    continue;
                }
                System.out.println(stack.remove(--current));
            } else if (order.equals("top")) {
                if (current == 0) {
                    System.out.println("-1");
                    continue;
                }
                System.out.println(stack.get(current-1));
            } else if (order.equals("size")) {
                System.out.println(stack.size());
            } else {
                if (stack.isEmpty()) System.out.println("1");
                else System.out.println("0");
            }
        }
    }
}
