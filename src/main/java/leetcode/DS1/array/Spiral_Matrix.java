package leetcode.DS1.array;

import java.util.List;

//https://leetcode.com/problems/spiral-matrix/description/

public class Spiral_Matrix {
    public static List<Integer> spiralOrder(int[][] matrix) {

        return null;

    }

    public static void main(String[] args) {

        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(spiralOrder(matrix));

    }

}

/*
on side note:
code to flatten nested array int[][] matrix:
    => Arrays.stream(matrix).flatMapToInt(ints -> Arrays.stream(ints)).toArray()
 */