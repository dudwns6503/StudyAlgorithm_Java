/*
BaekJoon 15596 정수 N개의 합
*/

import java.util.*;

public class P15596 {
    long sum(int[] a) {
        long ans = 0;
        for(int i=0; i<a.length; i++) {
            ans += a[i];
        }
        return ans;
    }
}
