/*
 * BOJ 13597 Tri-du
 *
 * memory : 14200kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P13597 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a == b)
            System.out.print(a);
        else if (a > b)
            System.out.print(a);
        else
            System.out.print(b);
    }
}
