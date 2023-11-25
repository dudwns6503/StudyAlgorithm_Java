/*
 * BOJ 17256 달달함이 넘쳐흘러
 *
 * memory : 14184kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P17256 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int aX = Integer.parseInt(st.nextToken());
        int aY = Integer.parseInt(st.nextToken());
        int aZ = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int cX = Integer.parseInt(st.nextToken());
        int cY = Integer.parseInt(st.nextToken());
        int cZ = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        sb.append(cX - aZ).append(" ").append(cY / aY).append(" ").append(cZ - aX);
        System.out.print(sb);
    }
}
