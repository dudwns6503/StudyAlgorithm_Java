/*
 * BOJ 20215 Cutting Corners
 *
 * memory : 14304kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P20215 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        double ans = (w + h) - Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
        System.out.print(ans);
    }
}
