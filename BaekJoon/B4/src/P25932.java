/*
 * BOJ 25932 Find the Twins
 *
 * memory : 14076kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P25932 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            boolean isZackThere = str.contains("17");
            boolean isMackThere = str.contains("18");

            sb.append(str).append("\n");

            if (isMackThere && isZackThere) {
                sb.append("both").append("\n");
            } else if (isMackThere) {
                sb.append("mack").append("\n");
            } else if (isZackThere) {
                sb.append("zack").append("\n");
            } else {
                sb.append("none").append("\n");
            }

            sb.append("\n");
        }

        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
        }

        System.out.print(sb);
    }
}
