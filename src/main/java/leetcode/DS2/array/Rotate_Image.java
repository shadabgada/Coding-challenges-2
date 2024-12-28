package leetcode.DS2.array;

import java.util.Arrays;

/*
https://leetcode.com/problems/rotate-image/description/
solution: https://leetcode.com/problems/rotate-image/solutions/18879/ac-java-in-place-solution-with-explanation-easy-to-understand/

 */
public class Rotate_Image {
    public static void rotate(int[][] matrix) {

        // transpose the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // flip the matrix horizontally (flip columns)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
        rotate(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }

}
