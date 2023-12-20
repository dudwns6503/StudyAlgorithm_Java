/*
 * BOJ 30501 관공... 어찌하여 목만 오셨소...
 *
 * memory : 14132kb
 * time : 136ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P30501 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String name = br.readLine();

            if (name.contains("S")) {
                System.out.print(name);
                break;
            }
        }
    }
}
