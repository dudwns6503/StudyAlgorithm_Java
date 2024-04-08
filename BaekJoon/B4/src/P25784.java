/*
 * BOJ 25784 Easy-to-Solve Expressions
 *
 * memory : 14288kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25784 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a + b == c || b + c == a || a + c == b) {
            System.out.print("1");
        } else if (a * b == c || b * c == a || a * c == b) {
            System.out.print("2");
        } else {
            System.out.print("3");
        }
    }
}
