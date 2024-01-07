/*
 * BOJ 10188 Quadrilateral
 *
 * memory : 14188kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10188 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());

            for (int j = 0; j < height; j++) {
                for (int k = 0; k < width; k++) {
                    sb.append("X");
                }
                sb.append("\n");
            }

            sb.append("\n");
        }

        if (sb.length() > 1)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
