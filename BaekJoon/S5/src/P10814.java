/*
 * BOJ 10814 나이순 정렬
 *
 * memory : 45664kb
 * time : 684ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10814 {

    static StringBuilder sb = new StringBuilder();

    static class Member implements Comparable<Member> {
        int age;
        String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }

        // Arrays.Sort는 stable하기 때문에 나이순으로만 정렬해도 됨.
        // 나이가 동등하다면 먼저 입력된 값이 앞에 있음.
        @Override
        public int compareTo(Member other) {
            return this.age - other.age;
        }

    }

    static void input() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        members = new Member[N];

        StringTokenizer st;

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());

            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            members[i] = new Member(age, name);
        }
    }

    static Member[] members;

    public static void main(String[] args) throws Exception {

        input();
        pro();
    }

    static void pro() {

        Arrays.sort(members);

        for(int i=0; i<members.length; i++) {
            sb.append(members[i].age).append(" ").append(members[i].name);
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
