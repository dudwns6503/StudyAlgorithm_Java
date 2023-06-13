/*
 * BOJ 20529 가장 가까운 세 사람의 심리적 거리
 *
 * memory : 30876kb
 * time : 548ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P20529 {

    private static List<String> list;
    private static int n, min;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        OUTER: while (t-- > 0) {
            min = Integer.MAX_VALUE;

            n = Integer.parseInt(br.readLine());
            list = new ArrayList<>();

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                list.add(st.nextToken());
            }

            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    for (int k = j + 1; k < list.size(); k++) {
                        int sum = 0;
                        sum += compare(list.get(i), list.get(j));
                        sum += compare(list.get(j), list.get(k));
                        sum += compare(list.get(i), list.get(k));

                        min = Math.min(min, sum);

                        if (min == 0) {
                            sb.append(min).append("\n");
                            continue OUTER;
                        }
                    }
                }
            }

            sb.append(min).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static int compare(String left, String right) {
        int score = 0;

        for (int i = 0; i < 4; i++) {
            char lc = left.charAt(i);
            char rc = right.charAt(i);

            if (lc != rc) {
                score++;
            }
        }

        return score;
    }
}
