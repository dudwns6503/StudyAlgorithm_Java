/*
BaekJoon 2752 세수정렬

가장 작은 수부터 오름차순으로 올라가는 것이 핵심 -> Arrays.sort()
*/

import java.util.*;

public class P2752 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];

        for(int i=0; i<3; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        for(int i=0; i<3; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
