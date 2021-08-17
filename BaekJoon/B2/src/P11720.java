/*
BaekJoon 11720 숫자의 합
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11720 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str;
        String[] strArray = new String[N];
        int sum = 0;
        str = br.readLine();
        strArray = str.split("");

        for(int i=0; i<N; i++) {
            sum += Integer.parseInt(strArray[i]);
        }
        System.out.println(sum);

    }
}
