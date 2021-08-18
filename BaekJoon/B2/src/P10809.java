/*
BaekJoon 10809 알파벳 찾기
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10809 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alpha = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int alphaNum = 0;
        String str = br.readLine();
        char alphabet;
        for(int i=0; i<str.length(); i++) {
            alphabet = str.charAt(i);
            alphaNum = alphabet - '0' - 49;
            if(alpha[alphaNum] == -1) {
                alpha[alphaNum] = i;
            }
        }
        for(int i=0; i<alpha.length; i++) {
            System.out.print(alpha[i] + " ");
        }
    }
}
