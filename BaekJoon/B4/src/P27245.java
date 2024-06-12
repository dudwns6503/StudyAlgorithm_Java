/*
 * BOJ 27245 Комната
 *
 * memory : 14240kb
 * time : 104ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P27245 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int w = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());
        int h = Integer.parseInt(br.readLine());

        int smallest = Math.min(w, l);
        int biggest = Math.max(w, l);

        if (smallest / h < 2)
            System.out.print("bad");
        else {
            if (biggest / smallest > 2)
                System.out.print("bad");
            else
                System.out.print("good");
        }
    }
}
