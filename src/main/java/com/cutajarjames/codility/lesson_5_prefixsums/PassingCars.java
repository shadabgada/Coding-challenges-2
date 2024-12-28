package com.cutajarjames.codility.lesson_5_prefixsums;

/**
 * This is the solution for Prefix Sums > Passing Cars
 * <p>
 * This is marked as PAINLESS difficulty
 */

public class PassingCars {

    //    public int solution(int[] A) {
//        int[] suffixSum = new int[A.length + 1];
//        int count = 0;
//        for (int i = A.length - 1; i >= 0; i--) {
//            suffixSum[i] = A[i] + suffixSum[i + 1];
//            if (A[i] == 0) count += suffixSum[i];
//            if (count > 1000000000) return -1;
//        }
//
//        return count;
//    }
    public int solution(int[] A) {
        // write your code in Java SE 8

        long totalCount = 0;
        long count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0)
                count++;
            if (A[i] == 1) {
                totalCount = totalCount + count;
            }
            if (totalCount > 1000000000)
                return -1;
        }

        return (int) totalCount;
    }

    public static void main(String[] args) {
        System.out.println(new PassingCars().solution(new int[]{0, 1, 0, 1, 1}));
    }
}

