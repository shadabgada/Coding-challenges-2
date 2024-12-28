package leetcode.DS1.array;

import java.util.Arrays;

/*
https://leetcode.com/problems/convert-1d-array-into-2d-array/description/
You are given a 0-indexed 1-dimensional (1D) integer array original, and two integers, m and n.
You are tasked with creating a 2-dimensional (2D) array with  m rows and n columns using all the elements from original.
The elements from indices 0 to n - 1 (inclusive) of original should form the first row of the constructed 2D array,
the elements from indices n to 2 * n - 1 (inclusive) should form the second row of the constructed 2D array, and so on.

Return an m x n 2D array constructed according to the above procedure, or an empty 2D array if it is impossible.
Example:
Input: original = [1,2,3,4], m = 2, n = 2
Output: [[1,2],[3,4]]

 */
public class Convert_1D_Array_Into_2D_Array {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n)
            return new int[0][0];

        int out_row = 0;
        int out_col = 0;
        int[][] output = new int[m][n];
        for (int i = 0; i < original.length; i++) {
            output[out_row][out_col] = original[i];
            out_col++;
            if (out_col == n) {
                out_col = 0;
                out_row++;
            }
        }
        return output;
    }

    public static void main(String[] args) {

//        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1, 2, 3, 4}, 2, 2)));
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1, 2, 3}, 1, 3)));
    }
}
