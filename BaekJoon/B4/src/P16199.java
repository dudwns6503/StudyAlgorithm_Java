/*
 * BOJ 16199 나이 계산하기
 *
 * memory : 14364kb
 * time : 128ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P16199 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int birthYear = Integer.parseInt(st.nextToken());
        int birthMonth = Integer.parseInt(st.nextToken());
        int birthDay = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        int manAge = 0;
        int koreaAge = 0;
        int yearAge = 0;

        if (year != birthYear) {
            manAge += year - birthYear - 1;
            if (month > birthMonth || ((month == birthMonth) && day >= birthDay))
                manAge++;
        }

        koreaAge += year - birthYear + 1;
        yearAge = year - birthYear;

        System.out.println(manAge);
        System.out.println(koreaAge);
        System.out.print(yearAge);
    }
}
