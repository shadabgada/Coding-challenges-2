package leetcode.DS1.array;

/*
https://leetcode.com/problems/reshape-the-matrix/description/
solution referred:
https://leetcode.com/problems/reshape-the-matrix/solutions/1727031/java-solution-detailed-explanation-easy-approch-100-efficent/

In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one
with a different size r x c keeping its original data.
You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns
of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix;
Otherwise, output the original matrix.

Example 1:
Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]

Example 2:
Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]

 */

import java.util.Arrays;

public class Reshape_the_Matrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        if (mat.length * mat[0].length != r * c)
            return mat;

        int[][] reshaped = new int[r][c];
        int output_rows = 0;
        int output_cols = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                reshaped[output_rows][output_cols] = mat[i][j];
                output_cols++;
                if (output_cols == c) {
                    output_cols = 0;
                    output_rows++;
                }
            }
        }
        return reshaped;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4)));
        System.out.println(Arrays.deepToString(matrixReshape(new int[][]{{1, 2}, {3, 4}}, 4, 1)));


    }
}
