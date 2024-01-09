/*
 * BOJ 8723 Patyki
 *
 * memory : 14224kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P8723 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] lengths = new int[3];
        lengths[0] = Integer.parseInt(st.nextToken());
        lengths[1] = Integer.parseInt(st.nextToken());
        lengths[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(lengths);

        if (lengths[0] == lengths[1] && lengths[1] == lengths[2])
            System.out.print("2");
        else if (canMakeRightTriangle(lengths[0], lengths[1], lengths[2]))
            System.out.print("1");
        else
            System.out.print("0");
    }

    private static boolean canMakeRightTriangle(int a, int b, int c) {
        return Math.pow(c, 2) == (Math.pow(a, 2) + Math.pow(b, 2));
    }
}
