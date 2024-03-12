/*
 * BOJ 17362 수학은 체육과목 입니다 2
 *
 * memory : 14176kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P17362 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n % 4 == 3)
            System.out.print(3);
        else if (n % 8 == 1)
            System.out.print(1);
        else if (n % 8 == 5)
            System.out.print(5);
        else if (n % 8 == 2 || n % 8 == 0)
            System.out.print(2);
        else
            System.out.print(4);
    }
}
