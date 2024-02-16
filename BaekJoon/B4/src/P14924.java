/*
 * BOJ 14924 폰 노이만과 파리
 *
 * memory : 14176kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14924 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        System.out.print(t * (d / (2 * s)));
    }
}
