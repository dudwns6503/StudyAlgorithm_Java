/*
 * BOJ 31611 火曜日 (Tuesday)
 *
 * memory : 14132kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P31611 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        if (x % 7 == 2)
            System.out.print("1");
        else
            System.out.print("0");
    }
}
