/*
 * BOJ 24751 Betting
 *
 * memory : 14348kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P24751 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(br.readLine());

        double first = 100 / a;
        double second = 100 / (100 - a);

        System.out.println(first);
        System.out.print(second);
    }
}
