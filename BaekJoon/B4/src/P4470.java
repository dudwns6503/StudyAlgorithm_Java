 /*
  * BOJ 4470 줄번호
  *
  * memory : 13980kb
  * time : 120ms
  */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P4470 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();

            sb.append(i).append(". ").append(name).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
