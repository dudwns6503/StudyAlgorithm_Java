/*
 * BOJ 21591 Laptop Sticker
 *
 * memory : 14100kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P21591 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int wc = Integer.parseInt(st.nextToken());
        int hc = Integer.parseInt(st.nextToken());
        int ws = Integer.parseInt(st.nextToken());
        int hs = Integer.parseInt(st.nextToken());

        if (wc - 2 >= ws && hc - 2 >= hs)
            System.out.print("1");
        else
            System.out.print("0");
    }
}
