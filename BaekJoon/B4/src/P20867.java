/*
 * BOJ 20867 Rulltrappa
 *
 * memory : 14328kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P20867 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int leftRemainder = m % g == 0 ? 0 : 1;
        int rightRemainder = m % s == 0 ? 0 : 1;

        int leftSecond = m / g + leftRemainder;
        int rightSecond = m / s + rightRemainder;

        leftRemainder = l % a == 0 ? 0 : 1;
        rightRemainder = r % b == 0 ? 0 : 1;
        int leftInitSecond = (int) (l / a) + leftRemainder;
        int rightInitSecond = (int) (r / b) + rightRemainder;

        if (leftSecond + leftInitSecond > rightSecond + rightInitSecond) {
            System.out.print("latmask");
        } else {
            System.out.print("friskus");
        }
    }
}
