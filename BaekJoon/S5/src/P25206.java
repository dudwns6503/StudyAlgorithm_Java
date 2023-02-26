/*
 * BOJ 25206 너의 평점은
 *
 * memory : 14284kb
 * time : 124ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25206 {

    private static double totalCredit, totalGrade;

    public static void main(String[] args) throws Exception {
        inputAndSolve();
    }

    private static void inputAndSolve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        totalCredit = 0.0;
        totalGrade = 0.0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());

            String subject = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (grade.equals("P")) continue;

            totalCredit += credit;

            // 학점 x 과목 평점
            if (grade.equals("A+")) {
                totalGrade += credit * 4.5;
            } else if (grade.equals("A0")) {
                totalGrade += credit * 4.0;
            } else if (grade.equals("B+")) {
                totalGrade += credit * 3.5;
            } else if (grade.equals("B0")) {
                totalGrade += credit * 3.0;
            } else if (grade.equals("C+")) {
                totalGrade += credit * 2.5;
            } else if (grade.equals("C0")) {
                totalGrade += credit * 2.0;
            } else if (grade.equals("D+")) {
                totalGrade += credit * 1.5;
            } else if (grade.equals("D0")) {
                totalGrade += credit * 1.0;
            } else {
                totalGrade += credit * 0.0;
            }

        }

        totalGrade /= totalCredit;
        System.out.print(totalGrade);
    }
}
