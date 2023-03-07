/*
 * BOJ 11723 집합
 *
 * memory : 300400kb
 * time : 1108ms
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11723 {

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        boolean[] count = new boolean[21];

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            String order = st.nextToken();

            if (order.equals("all") || order.equals("empty")) {
                switch (order) {
                    case "all":
                        Arrays.fill(count, true);
                        break;
                    case "empty":
                        Arrays.fill(count, false);
                        break;
                }
            } else {
                int x = Integer.parseInt(st.nextToken());

                switch (order) {
                    case "add":
                        count[x] = true;
                        break;
                    case "remove":
                        count[x] = false;
                        break;
                    case "check":
                        if (count[x]) bw.write("1\n");
                        else bw.write("0\n");
                        break;
                    case "toggle":
                        count[x] = !count[x];
                        break;
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
