/*
 * BOJ 15025 Judging Moose
 *
 * memory : 16016kb
 * time : 144ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15025 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        if (l == 0 && r == 0) {
            System.out.print("Not a moose");
        } else if (l == r) {
            System.out.print("Even " + l * 2);
        } else {
            System.out.print("Odd " + Math.max(l, r) * 2);
        }
    }
}
