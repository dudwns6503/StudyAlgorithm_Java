/*
BaekJoon 1157 단어 공부

알파벳을 숫자로 나타내는 것이 핵심
*/

import java.io.*;

public class P1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] number = new int[26]; // 영문자의 개수만큼 배열 선언
        String alpha = br.readLine();

        for(int i=0; i<alpha.length(); i++) {
            if('A' <= alpha.charAt(i) && alpha.charAt(i) <= 'Z') { // 대문자 범위라면
                number[alpha.charAt(i) - 'A']++; // -A를 해줘야 해당 알파벳을 표현하는 아스키코드로 변환되며, 인덱스에 +1을 해줄 수 있음.
            } else { // 소문자라면
                number[alpha.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char answer = '?';

        for(int i=0; i<26; i++) {
            if(number[i] > max) {
                max = number[i];
                answer = (char)(i + 65); // 대문자로 출력
            }
            else if (number[i] == max) {
                answer = '?';
            }
        }

        System.out.print(answer);
    }
}
