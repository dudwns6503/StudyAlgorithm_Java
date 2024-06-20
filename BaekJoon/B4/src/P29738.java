/*
 * BOJ 29738 Goodbye, Code Jam
 *
 * memory : 14220kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P29738 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            int rank = Integer.parseInt(br.readLine());
            if (rank > 4500) {
                sb.append("Case #").append(i).append(": ").append("Round 1").append("\n");
            } else if (rank > 1000) {
                sb.append("Case #").append(i).append(": ").append("Round 2").append("\n");
            } else if (rank > 25) {
                sb.append("Case #").append(i).append(": ").append("Round 3").append("\n");
            } else {
                sb.append("Case #").append(i).append(": ").append("World Finals").append("\n");
            }
        }

        System.out.print(sb);
    }
}
