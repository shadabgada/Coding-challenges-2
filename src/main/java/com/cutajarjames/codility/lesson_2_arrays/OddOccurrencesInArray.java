package com.cutajarjames.codility.lesson_2_arrays;

import java.util.Arrays;

public class OddOccurrencesInArray {
    public static int solution(int[] A) {

        if (A.length == 0){
            return 0;
        }
        if (A.length == 1) {
            return A[0];
        }
        //{9, 3, 9, 3, 9, 7, 9}
        Arrays.parallelSort(A);
        //{3, 3, 7, 9, 9, 9, 9}
        for(int i=0; i<A.length-2; i+=2) {
            if(A[i]!=A[i+1])
                return A[i];
        }
        return A[A.length-1];
    }

    public static int solution2(int[] A) {
        int result = 0;
        for (int x : A) {
            result ^= x;
            /**
             * This uses the fact, that x ^ x == 0 for any x and the associativity of ^.
             * This means that any pair of equal values cancels out, what remains is the single unpaired value
             */
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
        System.out.println(solution2(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }

}
