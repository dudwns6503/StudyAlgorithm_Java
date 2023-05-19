/*
 * BOJ 8979 올림픽
 *
 * memory : 14880kb
 * time : 152ms
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P8979 {

    private static ArrayList<Nation> nations = new ArrayList<>();
    private static int n, k;

    public static void main(String[] args) throws Exception {
        input();
        solve();
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int nationNumber = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());

            nations.add(new Nation(nationNumber, gold, silver, bronze));
        }
    }

    private static void solve() {
        Collections.sort(nations);

        Map<Integer, Integer> grades = new HashMap<>();

        int grade = 1;
        int originalGrade = 1;
        grades.put(nations.get(0).nationNumber, grade);

        for (int i = 1; i < nations.size(); i++) {

            grade++;
            originalGrade++;
            int nationNumber = nations.get(i).nationNumber;
            int prevGold = nations.get(i - 1).gold;
            int prevSilver = nations.get(i - 1).silver;
            int prevBronze = nations.get(i - 1).bronze;

            if (prevGold == nations.get(i).gold && prevSilver == nations.get(i).silver && prevBronze == nations.get(i).bronze) {
                --grade;
                grades.put(nationNumber, grade);
            } else {
                grades.put(nationNumber, originalGrade);
                grade = originalGrade;
            }
        }

        System.out.print(grades.get(k));
    }

    static class Nation implements Comparable<Nation> {

        private final int nationNumber;
        private final int gold;
        private final int silver;
        private final int bronze;

        public Nation(int nationNumber, int gold, int silver, int bronze) {
            this.nationNumber = nationNumber;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }

        @Override
        public int compareTo(Nation other) {
            if (this.gold != other.gold) return other.gold - this.gold;
            if (this.silver != other.silver) return other.silver - this.silver;
            return other.bronze - this.bronze;
        }
    }
}
