/*
 * BOJ 1181 단어 정렬
 *
 * memory : 27016kb
 * time : 740ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P1181 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 알파벳을 저장할 ArrayList
        ArrayList<String> str = new ArrayList<String>();


        for(int i=0; i<N; i++) {
            str.add(br.readLine());
        }

        // 사전 순으로 정렬
        Collections.sort(str);

        // 사전 순으로 정렬된 단어에서 길이가 짧은 단어부터 출력하기 위한 반복문
        for(int length=1; length<=50; length++) {
            // 중복체크하기 위해 이전의 단어를 저장할 변수
            String prev = "";
            for(int j=0; j<str.size(); j++) {
                // 길이가 더 짧고 && 중복되지 않았다면 출력
                if(length == str.get(j).length() && !prev.equals(str.get(j))) {
                    System.out.println(str.get(j));
                    // 중복 체크하기 위해 prev에 값 저장.
                    prev = str.get(j);
                }
            }
        }
    }
}
