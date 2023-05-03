 /*
  * BOJ 6603 로또
  *
  * memory : 14320kb
  * time : 132ms
  */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P6603 {

    private static StringBuilder sb = new StringBuilder();
    private static int[] numbers, selected;
    private static int k;

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());

            k = Integer.parseInt(st.nextToken());
            if (k == 0) break;

            selected = new int[6];
            numbers = new int[k];

            for (int i = 0; i < k; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }

            rec_func(0, 0);
            sb.append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static void rec_func(int start, int cnt) {
        if (cnt == 6) {
            for (int i = 0; i < 6; i++) {
                sb.append(selected[i]).append(" ");
            }

            sb.deleteCharAt(sb.length() - 1);
            sb.append("\n");
            return;
        }

        for (int i = start; i < k; i++) {
            selected[cnt] = numbers[i];
            rec_func(i + 1, cnt + 1);
            selected[cnt] = 0;
        }
    }
}
