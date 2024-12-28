package com.cutajarjames.codility.lesson_5_prefixsums;

/**
 * This is the solution for Prefix Sums > Count Div
 * <p>
 * This is marked as Respectable difficulty
 */


public class CountDiv {
    public int solution(int A, int B, int K) {
        double nStart = Math.ceil(A / (double) K);
        double nEnd = Math.floor(B / (double) K);
        return (int) (nEnd - nStart + 1);
    }

    public static void print(int s, String[] args) {
        System.out.println(args.length);
    }
    public static void main(String[] args) {
        System.out.println(new CountDiv().solution(6, 11, 2));
        System.out.println(new CountDiv().solution(0, 0, 11));


        int i = 0;
        while(i>0) {
            i++;
        }
        System.out.println("finished");
    }

}
