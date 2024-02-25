/*
 * BOJ 18414 X に最も近い値 (The Nearest Value)
 *
 * memory : 14244kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P18414 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        if (x >= l && x <= r)
            System.out.print(x);
        else {
            if (Math.abs(x - l) > Math.abs(x - r))
                System.out.print(r);
            else
                System.out.print(l);
        }
    }
}
