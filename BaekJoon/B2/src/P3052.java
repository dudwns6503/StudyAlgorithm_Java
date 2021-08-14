/*
BaekJoon 3052 나머지
*/

import java.util.*;

public class P3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[10];

        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt() % 42;
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}
