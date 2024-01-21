/*
 * BOJ 14470 전자레인지
 *
 * memory : 14208kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P14470 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        int sum = 0;

        if (a == b)
            System.out.print("0");
        else {
            if (a < 0) {
                if (b < 0) {
                    sum += (b - a) * c;
                } else {
                    sum += (- a) * c;
                    sum += d;
                }
            }

            if (b > 0) {
                if (a > 0) {
                    sum += (b - a) * e;
                } else {
                    sum += b * e;
                }
            }
        }

        System.out.print(sum);
    }
}
