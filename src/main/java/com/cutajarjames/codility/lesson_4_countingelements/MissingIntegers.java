package com.cutajarjames.codility.lesson_4_countingelements;

import java.util.Arrays;

public class MissingIntegers {

    public int solution(int[] A) {
        // Implement your solution here

        int smallest = 1;
        Arrays.sort(A);

        for(int x:A)  {
            if(smallest==x) {
                smallest++;
            }
        }
        
        return smallest;
    }

    public static void main(String[] args) {
        System.out.println(new MissingIntegers().solution(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(new MissingIntegers().solution(new int[]{1, 2, 3}));
        System.out.println(new MissingIntegers().solution(new int[]{-1, -3}));
    }
}
