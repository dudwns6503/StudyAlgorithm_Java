/*
BaekJoon 2577 숫자의 개수
*/

import java.util.Scanner;

public class P2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum = A * B * C;
        int[] arr = new int[10];
        String strSum = String.valueOf(sum);
        String[] strArr = new String[10];
        strArr = strSum.split("");

        for(int i=0; i<strArr.length; i++) {
            for(int j=0; j<10; j++) {
                if (Integer.parseInt(strArr[i]) == j) {
                    arr[j] += 1;
                    break;
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
