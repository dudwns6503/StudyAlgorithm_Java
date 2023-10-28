/*
 * BOJ 16099 Larger Sport Facility
 *
 * memory : 16724kb
 * time : 180ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P16099 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t -- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long l1 = Long.parseLong(st.nextToken());
            long w1 = Long.parseLong(st.nextToken());
            long l2 = Long.parseLong(st.nextToken());
            long w2 = Long.parseLong(st.nextToken());

            double area1 = l1 * w1;
            double area2 = l2 * w2;

            if (area1 == area2)
                sb.append("Tie").append("\n");
            else if (area1 > area2)
                sb.append("TelecomParisTech").append("\n");
            else
                sb.append("Eurecom").append("\n");
        }

        System.out.print(sb);
    }
}
