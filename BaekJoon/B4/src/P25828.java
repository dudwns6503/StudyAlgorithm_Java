/*
 * BOJ 25828 Corona Virus Testing
 *
 * memory : 14176kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25828 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int g = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int left = g * p;
        int right = g + p * t;

        if (left > right)
            System.out.print("2");
        else if (left < right)
            System.out.print("1");
        else
            System.out.print("0");
    }
}
