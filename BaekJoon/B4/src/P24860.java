/*
 * BOJ 24860 Counting Antibodies
 *
 * memory : 14168kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P24860 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int vk = Integer.parseInt(st.nextToken());
        int jk = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int vl = Integer.parseInt(st.nextToken());
        int jl = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int vh = Integer.parseInt(st.nextToken());
        int dh = Integer.parseInt(st.nextToken());
        int jh = Integer.parseInt(st.nextToken());

        System.out.print((((long) vk * jk) + ((long) vl * jl)) * ((long)vh * dh * jh));
    }
}
