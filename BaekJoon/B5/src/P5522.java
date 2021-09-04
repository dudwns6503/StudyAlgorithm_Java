/*
BaekJoon 5522 카드 게임
*/

import java.util.*;

public class P5522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<5; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
