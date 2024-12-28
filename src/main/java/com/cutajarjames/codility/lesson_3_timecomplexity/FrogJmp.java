package com.cutajarjames.codility.lesson_3_timecomplexity;

public class FrogJmp {

    public int solution(int X, int Y, int D) {
        // Implement your solution here
        int diff = Y - X;
        int remainder = diff % D;
        int s3 = diff / D;
        if (remainder > 0) {
            s3++;
        }
        return s3;
    }

    public static void main(String[] args) {
        System.out.println(new FrogJmp().solution(10, 85, 30));
    }
}
