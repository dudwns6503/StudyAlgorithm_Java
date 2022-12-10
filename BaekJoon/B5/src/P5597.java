/*
 * BOJ 5597 과제 안 내신 분..?
 *
 * memory : 14068kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5597 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[31];
        for (int i = 0; i < 28; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i < 31; i++) {
            if (arr[i] == 0) System.out.println(i);
        }
    }
}
