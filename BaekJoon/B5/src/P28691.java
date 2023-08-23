/*
 * BOJ 28691 정보보호학부 동아리 소개
 *
 * memory : 14148kb
 * time : 120ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P28691 {

    public static void main(String[] args) throws Exception {
        input();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();

        map.put("M", "MatKor");
        map.put("W", "WiCys");
        map.put("C", "CyKor");
        map.put("A", "AlKor");
        map.put("$", "$clear");

        String first = br.readLine();

        System.out.print(map.get(first));
    }
}
