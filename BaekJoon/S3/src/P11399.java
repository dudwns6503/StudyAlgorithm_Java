/*
BaekJoon 11399 ATM
*/

import java.util.*;

public class P11399 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int totalTime = 0;
        int waitTime = 0;
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        // 앞쪽에서 기다리는 시간을 최소화하면 이후에 시간도 자연스럽게 작은 값이 된다.
        Arrays.sort(arr);

        for(int i=0; i<N; i++) {
            waitTime += arr[i];
            totalTime += waitTime;
        }
        System.out.println(totalTime);
    }
}
