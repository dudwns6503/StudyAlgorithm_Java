/*
 * BOJ 13623 Zero or One
 *
 * memory : 14132kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P13623 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a == b && b == c)
            System.out.print("*");
        else if (a == b && b != c)
            System.out.print("C");
        else if (a == c && a != b)
            System.out.print("B");
        else {
            System.out.print("A");
        }
    }
}
