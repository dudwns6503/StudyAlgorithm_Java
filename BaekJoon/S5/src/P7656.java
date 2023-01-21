/*
 * BOJ 7656 만능 오라클
 *
 * memory : 14124kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P7656 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        Queue<String> queue = new LinkedList<>();

        while (st.hasMoreTokens()) {
            String str = st.nextToken();

            queue.offer(str);

            if (str.contains(".")) {
                queue.clear();
            } else if (str.contains("?")) {
                while (!queue.isEmpty()) {
                    sb.append(
                            queue.poll()
                                    .replace("What", "Forty-two")
                                    .replace("?", ".")
                    ).append(" ");
                }
                sb.deleteCharAt(sb.length() - 1);
                sb.append("\n");
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
