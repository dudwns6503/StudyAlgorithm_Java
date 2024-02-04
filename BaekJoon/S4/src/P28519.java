/*
 * BOJ 28519 Планеты двух измерений
 *
 * memory : 15776kb
 * time : 752ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P28519 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int sum = 0;
        while (n > 0 && m > 0) {
            sum += 2;

            n--;
            m--;
        }

        if (n != 0 || m != 0)
            sum += 1;

        System.out.print(sum);
    }
}
