/*
 * BOJ 10825 국영수
 *
 * memory : 59808kb
 * time : 728ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10825 {
    static StringBuilder sb = new StringBuilder();

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        student = new Student[N];

        StringTokenizer st;

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            student[i] = new Student();
            student[i].name = st.nextToken();
            student[i].korean = Integer.parseInt(st.nextToken());
            student[i].english = Integer.parseInt(st.nextToken());
            student[i].math = Integer.parseInt(st.nextToken());
        }
    }

    static class Student implements Comparable<Student> {
        String name;
        int korean, english, math;

        @Override
        public int compareTo(Student other) {
            // 1. 국어 점수가 감소하는 순
            if(korean != other.korean) return other.korean - korean;
            // 2. 영어 점수가 증가하는 순
            if(english != other.english) return english - other.english;
            // 3. 수학 점수가 감소하는 순
            if(math != other.math) return other.math - math;
            // 4. 이름 사전 순으로 증가하는 순
            return name.compareTo(other.name);
        }
    }

    static Student[] student;
    static int N;

    public static void main(String[] args) throws Exception {

        input();

        sort();
    }

    public static void sort() {

        Arrays.sort(student);

        for(int i=0; i<N; i++) {
            sb.append(student[i].name).append("\n");
        }

        System.out.println(sb.toString());
    }
}
