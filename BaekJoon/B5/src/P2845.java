/*
BaekJoon 2845 파티가 끝나고 난 뒤
*/

import java.util.*;

public class P2845 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int P = sc.nextInt();
        int[] article = new int[5];
        for(int i=0; i<5; i++) {
            article[i] = sc.nextInt();
        }

        int sang = L * P;
        for(int i=0; i<article.length; i++) {
            article[i] -= sang;
            System.out.print(article[i] + " ");
        }
    }
}
