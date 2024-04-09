/*
 * BOJ 17548 Greetings!
 *
 * memory : 14100kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P17548 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int eCount = (input.length() - 2) * 2;

        StringBuilder sb = new StringBuilder();

        sb.append("h");
        for (int i = 0; i < eCount; i++) {
            sb.append("e");
        }
        sb.append("y");

        System.out.print(sb);
    }
}
