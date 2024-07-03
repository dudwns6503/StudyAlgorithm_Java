/*
 * BOJ 26350 Good Coin Denomination
 *
 * memory : 13996kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P26350 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            boolean flag = true;

            int d = Integer.parseInt(st.nextToken());
            int prevNum = Integer.parseInt(st.nextToken());

            sb.append("Denominations:").append(" ").append(prevNum).append(" ");
            for (int j = 0; j < d - 1; j++) {
                int currentNum = Integer.parseInt(st.nextToken());
                sb.append(currentNum).append(" ");

                if (currentNum < prevNum * 2) {
                    flag = false;
                }

                prevNum = currentNum;
            }

            if (flag) {
                sb.deleteCharAt(sb.length() - 1);
                sb.append("\n");
                sb.append("Good coin denominations!");
                sb.append("\n").append("\n");
            }
            else {
                sb.deleteCharAt(sb.length() - 1);
                sb.append("\n");
                sb.append("Bad coin denominations!");
                sb.append("\n").append("\n");
            }
        }

        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
        }

        System.out.print(sb);
    }
}
