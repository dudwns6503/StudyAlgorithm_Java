/*
BaekJoon 2338 긴자리 계산
*/

import java.math.*;
import java.util.*;

public class P2338 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();

        System.out.println(A.add(B));
        System.out.println(A.subtract(B));
        System.out.println(A.multiply(B));
    }
}
