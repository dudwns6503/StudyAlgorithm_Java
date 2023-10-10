/*
 * BOJ 26574 Copier
 *
 * memory : 14616kb
 * time : 144ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P26574 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            System.out.println(number + " " + number);
        }
    }
}
