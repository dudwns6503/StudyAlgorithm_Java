/*
 * BOJ 8674 Tabliczka
 *
 * memory : 14080kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P8674 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        if (a % 2 == 0 || b % 2 == 0)
            System.out.print(0);
        else
            System.out.print(Math.min(a, b));
    }
}
