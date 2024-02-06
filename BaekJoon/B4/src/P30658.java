/*
 * BOJ 30658 Os últimos serão os primeiros
 *
 * memory : 14640kb
 * time : 144ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P30658 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringBuilder sb = new StringBuilder();
            int t = Integer.parseInt(br.readLine());

            if (t == 0)
                break;

            int[] arrays = new int[t];

            for (int i = 0; i < arrays.length; i++) {
                arrays[i] = Integer.parseInt(br.readLine());
            }

            for (int i = arrays.length - 1; i >= 0; i--) {
                sb.append(arrays[i]).append("\n");
            }

            sb.append(0).append("\n");
            System.out.print(sb);
        }
    }
}
