/*
 * BOJ 28278 스택 2
 *
 * memory : 236160kb
 * time : 1108ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P28278 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int oper = Integer.parseInt(st.nextToken());

            if (oper == 1) {
                int num = Integer.parseInt(st.nextToken());
                stack.add(num);
            } else if (oper == 2) {
                if (stack.isEmpty())
                    sb.append("-1").append("\n");
                else
                    sb.append(stack.pop()).append("\n");
            } else if (oper == 3) {
                sb.append(stack.size()).append("\n");
            } else if (oper == 4) {
                if (stack.isEmpty())
                    sb.append("1").append("\n");
                else
                    sb.append("0").append("\n");
            } else {
                if (stack.isEmpty())
                    sb.append("-1").append("\n");
                else
                    sb.append(stack.peek()).append("\n");
            }
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
