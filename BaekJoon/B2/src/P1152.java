/*
BaekJoon 1152 단어의 개수

공백을 기준으로 단어가 어떻게 생기는지 생각하기
*/

import java.io.*;

public class P1152 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int answer = 1;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == ' ' && i != 0 && i != str.length() - 1) {
                answer++;
            }
        }
        if(str.equals(" "))
            System.out.print(0);
        else {
            System.out.print(answer);
        }
    }
}
