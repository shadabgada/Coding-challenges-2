package com.cutajarjames.codility.caterpillarmethod;

import java.util.Arrays;

/**
 * This is the solution for Caterpillar method > MinAbsSumOfTwo
 *
 * This is marked as RESPECTABLE difficulty
 */

public class MinAbsSumOfTwo {
    public int solution(int[] A) {
        int minAbsSumOfTwo = Integer.MAX_VALUE;
        Arrays.sort(A);
        int head = 0;
        int tail = A.length - 1;
        while (head <= tail) {
            minAbsSumOfTwo = Math.min(minAbsSumOfTwo, Math.abs(A[head] + A[tail]));
            if (A[head] + A[tail] < 0) head++;
            else tail--;
        }
        return minAbsSumOfTwo;
    }

    //My solution: O(N^2)
    public static int solution2(int[] A) {
        // write your code in Java SE 8

        int min = Integer.MAX_VALUE;

        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < A.length; windowEnd++) {

            int temp = Math.abs(A[windowStart] + A[windowEnd]);
            if (min > temp)
                min = temp;
            if (windowEnd == A.length - 1) {
                windowEnd = windowStart;
                windowStart++;
            }
            if (windowStart == A.length - 1)
                break;

        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(new MinAbsSumOfTwo().solution(new int[]{-7, 3, -1, 5, -11, 4, -9, 14, 17, -2})); //1
        System.out.println(new MinAbsSumOfTwo().solution(new int[]{8, 3, 5, 16, 11})); //6
        System.out.println(new MinAbsSumOfTwo().solution(new int[]{-7, -5, -6, -2, -9})); //4
        System.out.println(new MinAbsSumOfTwo().solution(new int[]{-7, 3, -6, 1, 0, -9})); //0
        System.out.println(new MinAbsSumOfTwo().solution(new int[]{-22, 3, 4, 5})); //6

        System.out.println(solution2(new int[]{8, 5, 3, 4, 6, 8}));
        System.out.println(solution2(new int[]{-8, 4, 5, -10, 3}));

    }


}
