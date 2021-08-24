/*
SW Expert Academy 문제 3289 서로소 집합
*/

import java.util.*;
import java.io.*;

public class P3289 {
    static int T, n, m;
    static int[] parents;

    private static void makeSet() {
        for(int i=1; i<=n; i++) {
            parents[i] = i;
        }
    }

    private static int findSet(int a) {
        if(a == parents[a]) return a;
        return parents[a] = findSet(parents[a]);
    }

    private static boolean unionSet(int a, int b) {
        int aRoot = findSet(a);
        int bRoot = findSet(b);
        if(aRoot == bRoot) return false;

        parents[bRoot] = aRoot;
        return true;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        T = Integer.parseInt(st.nextToken());

        for(int test_case=1; test_case<=T; test_case++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            parents = new int[n+1];
            makeSet();

            System.out.print("#" + test_case + " ");

            for(int i=0; i<m; i++) {
                st = new StringTokenizer(br.readLine());
                int operation = Integer.parseInt(st.nextToken());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                if(operation == 0) unionSet(a, b);
                else {
                    if(findSet(a) == findSet(b)) {
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                }
            }
            System.out.println();
        }
    }
}