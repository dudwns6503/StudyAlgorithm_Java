/*
 * BOJ 7568 덩치
 *
 * memory : 14148kb
 * time : 124ms
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P7568 {

    static Person[] persons;
    static int[] rank;
    static int n;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        persons = new Person[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());

            persons[i] = new Person(weight, height);
        }
    }

    private static void solve() {
        StringBuilder sb = new StringBuilder();
        int count;

        for (int i = 0; i < persons.length; i++) {
            count = 0;
            for (int j = 0; j < persons.length; j++) {
                if (i == j) continue;

                if (persons[i].weight < persons[j].weight && persons[i].height < persons[j].height) {
                    count++;
                }
            }
            rank[i] = count + 1;
        }

        for (int i = 0; i < rank.length; i++) {
            sb.append(rank[i]).append(" ");
        }

        System.out.print(sb);
    }

    static class Person {

        private int weight;
        private int height;

        public Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }
    }
}
