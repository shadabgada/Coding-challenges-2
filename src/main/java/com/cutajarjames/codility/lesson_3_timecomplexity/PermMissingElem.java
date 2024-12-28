package com.cutajarjames.codility.lesson_3_timecomplexity;

import java.util.Arrays;

/**
 * This is the solution for Time Complexity > PermMissingElem
 * <p>
 * This is marked as PAINLESS difficulty
 */
public class PermMissingElem {
    public int solution(int[] A) {
        long actualSum = 0;
        for (int number : A) {
            actualSum += number;
        }
        long maxNumber = A.length + 1;
        long expectedSum = (maxNumber * (maxNumber + 1) / 2);
        return (int) (expectedSum - actualSum);
    }

    public int solution2(int[] A) {
        Arrays.parallelSort(A);
        if (A.length == 0) {
            return 1;
        }
        // 1,2,3,5
        int missingElement = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                missingElement = i + 1;
                break;
            }
        }
        if (missingElement == -1) {
            missingElement = A.length + 1;
        }
        return missingElement;
    }

    public static void main(String[] args) {
        System.out.println(new PermMissingElem().solution(new int[]{2, 3, 1, 5}));
        System.out.println(new PermMissingElem().solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        System.out.println(new PermMissingElem().solution(new int[]{}));

        System.out.println(new PermMissingElem().solution2(new int[]{2, 3, 1, 5}));
        System.out.println(new PermMissingElem().solution2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        System.out.println(new PermMissingElem().solution(new int[]{}));

    }
}
