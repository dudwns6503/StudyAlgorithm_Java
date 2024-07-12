/*
 * BOJ 11720 숫자의 합
 *
 * memory : 14316kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11720 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String number = br.readLine();

        int sum = 0;
        for (char c : number.toCharArray()) {
            sum += c - '0';
        }

        System.out.print(sum);
    }
}
