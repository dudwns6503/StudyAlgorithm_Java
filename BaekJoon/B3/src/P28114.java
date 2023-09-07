/*
 * BOJ 28114 팀명 정하기
 *
 * memory : 14308kb
 * time : 132ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P28114 {

    private static Person[] persons;
    private static int[] y;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        persons = new Person[3];
        y = new int[3];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());

            int solvedProblem = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken()) % 100;
            String lastName = st.nextToken();

            persons[i] = new Person(solvedProblem, lastName);
        }
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        Arrays.sort(y);
        Arrays.sort(persons);

        for (int i = 0; i < 3; i++) {
            sb.append(y[i]);
        }

        sb.append("\n");

        for (int i = 0; i < 3; i++) {
            sb.append(persons[i].getLastName().charAt(0));
        }

        System.out.print(sb);
    }


    static class Person implements Comparable<Person> {

        private int solvedNumber;
        private String lastName;

        public Person(int solvedNumber, String lastName) {
            this.solvedNumber = solvedNumber;
            this.lastName = lastName;
        }

        public int getSolvedNumber() {
            return solvedNumber;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public int compareTo(Person other) {
            // 내림차순으로 정렬
            return other.solvedNumber - this.solvedNumber;
        }
    }
}
