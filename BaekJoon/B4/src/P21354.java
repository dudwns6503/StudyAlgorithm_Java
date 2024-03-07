/*
 * BOJ 21354 Äpplen och päron
 *
 * memory : 14048kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P21354 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = 7 * Integer.parseInt(st.nextToken());
        int p = 13 * Integer.parseInt(st.nextToken());


        if (a > p)
            System.out.print("Axel");
        else if (a < p)
            System.out.print("Petra");
        else
            System.out.print("lika");
    }
}
