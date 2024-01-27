/*
 * BOJ 15474 鉛筆 (Pencils)
 *
 * memory : 14204kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15474 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int sum1 = 0;
        int sum2 = 0;

        sum1 += (n / a) * b;
        sum1 += (n % a) != 0 ? b : 0;

        sum2 += (n / c) * d;
        sum2 += (n % c) != 0 ? d : 0;

        System.out.print(Math.min(sum1, sum2));
    }
}
