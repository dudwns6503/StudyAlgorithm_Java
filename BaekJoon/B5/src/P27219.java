/*
 * BOJ 27219 Робинзон Крузо
 *
 * memory : 14144kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P27219 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n / 5; i++) {
            sb.append("V");
        }

        for (int i = 0; i < n % 5; i++) {
            sb.append("I");
        }

        System.out.print(sb);
    }
}
