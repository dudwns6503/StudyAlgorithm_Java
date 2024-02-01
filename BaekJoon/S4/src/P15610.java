/*
 * BOJ 15610 Abbey Courtyard
 *
 * memory : 14196kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P15610 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long a = Long.parseLong(br.readLine());

        double line = Math.sqrt(a);

        System.out.print(line * 4);
    }
}
