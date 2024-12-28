package com.cutajarjames.codility.lesson_4_countingelements;

import java.util.Arrays;

/**
 * This is the solution for CountingElements > PermCheck
 * <p>
 * This is marked as RESPECTABLE difficulty
 */
public class PermCheck {

    public int solution(int[] A) {
        // Implement your solution here
        boolean[] presentMarkers = new boolean[A.length + 2];
        Arrays.fill(presentMarkers, false);
        for(int x: A) {
            if (x > 0 && x <= A.length) presentMarkers[x] = true;
        }
        // returns when it finds the index with false value (i.e. missing values)
        for(int x=1;x<presentMarkers.length-1;x++) {
            if(!presentMarkers[x]) {
                return 0;
            }
        }
        return 1;
    }


    public static void main(String[] args) {
//        System.out.println(new PermCheck().solution(new int[]{1,3,6,4,1,2}));
        System.out.println(new PermCheck().solution(new int[]{4, 1, 3, 2}));

        //        System.out.println(new PermCheck().solution(new int[]{1,3,6,4,1,2}));
//        System.out.println(new PermCheck().solution(new int[]{1,1,1,9,9,9}));
//        System.out.println(new PermCheck().solution(new int[]{1, 2, 3}));
//        System.out.println(new PermCheck().solution(new int[]{-1, -3}));
//        System.out.println(new PermCheck().solution(new int[]{-1, -3, 1}));
//        System.out.println(new PermCheck().solution(new int[]{-1, -3, 3}));
    }
}
