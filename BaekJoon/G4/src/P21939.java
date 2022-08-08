/*
 * BOJ 21939 문제 추천 시스템 Version 1
 *
 * memory : 53352kb
 * time : 624ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class P21939 {

    static class Problem implements Comparable<Problem> {
        int num, difficulty;

        public Problem(int num, int difficulty) {
            this.num = num;
            this.difficulty = difficulty;
        }

        @Override
        public int compareTo(Problem other) {
            if(this.difficulty != other.difficulty) return this.difficulty - other.difficulty;
            return this.num - other.num;
        }
    }

    static StringBuilder sb = new StringBuilder();
    static TreeSet<Problem> treeSet;
    static HashMap<Integer, Integer> problems;
    static int N, M;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        treeSet = new TreeSet<>();
        problems = new HashMap<>();

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            int difficulty = Integer.parseInt(st.nextToken());

            treeSet.add(new Problem(num, difficulty));
            problems.put(num, difficulty);
        }

        M = Integer.parseInt(br.readLine());

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());

            String order = st.nextToken();
            if(order.equals("add")) {
                int P = Integer.parseInt(st.nextToken());
                int L = Integer.parseInt(st.nextToken());

                treeSet.add(new Problem(P, L));
                problems.put(P, L);
            }
            else if(order.equals("recommend")){
                int x = Integer.parseInt(st.nextToken());

                if(x == -1) sb.append(treeSet.first().num).append("\n");
                else sb.append(treeSet.last().num).append("\n");
            }
            else if(order.equals("solved")) {
                int num = Integer.parseInt(st.nextToken());
                int difficulty = problems.get(num);

                treeSet.remove(new Problem(num, difficulty));
                problems.remove(num);
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        input();
    }
}
