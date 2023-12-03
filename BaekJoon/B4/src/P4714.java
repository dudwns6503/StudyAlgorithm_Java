/*
 * BOJ 4714 Lunacy
 *
 * memory : 14380kb
 * time : 136ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P4714 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            double weight = Double.parseDouble(br.readLine());

            if (weight < 0) break;

            sb.append("Objects weighing ").append(String.format("%.2f", weight)).append(" on Earth will weigh ")
                    .append(String.format("%.2f", weight * 0.167)).append(" on the moon.").append("\n");
        }

        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
