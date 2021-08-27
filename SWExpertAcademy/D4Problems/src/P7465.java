/*
SW Expert Academy 문제 7465 창용 마을 무리의 개수
*/

import java.util.*;

public class P7465 {

    static int[] parents;
    static int N;

    // 오늘 배웠던 DisjointSet
    private static void makeSet() {
        parents = new int[N+1]; // 1부터 시작하므로 N+1로 만들어주었다.
        for(int i=1; i<=N; i++) {
            parents[i] = i;
        }
    }

    private static int findSet(int a) {
        if (a == parents[a]) return a;

        return parents[a] = findSet(parents[a]);
    }

    private static boolean unionSet(int a, int b) {
        int aRoof = findSet(a);
        int bRoof = findSet(b);
        if(aRoof == bRoof) return false;

        parents[bRoof] = aRoof;
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case=1; test_case<=T; test_case++) {
            N = sc.nextInt();
            int M = sc.nextInt();
            HashSet<Integer> set = new HashSet<>(); // 대표의 중복을 제거하기 위하여 set을 사용함.
            makeSet();

            for(int i=0; i<M; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                unionSet(a, b);
            }

            for(int i=1; i<=N; i++) {
                set.add(findSet(i)); // 1부터 N까지 대표자를 set에 넣어줌(중복은 자동으로 사라진다)
            }

            System.out.println("#" + test_case + " " + set.size());

        } sc.close();
    }
}
