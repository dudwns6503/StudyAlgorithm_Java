/*
 * BOJ 20353 Atrium
 *
 * memory : 14276kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P20353 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long a = Long.parseLong(br.readLine());

        double x = Math.sqrt(a);
        System.out.print(x * 4);
    }
}
