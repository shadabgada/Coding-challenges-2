package leetcode.DS1.array;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/pascals-triangle/

 */
public class Pascals_Triangle {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> allRows = new ArrayList<>();
        if (numRows == 0)
            return allRows;

        // seed first row
        allRows.add(List.of(1));

        for (int i = 1; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();
            // add first 1 in each row
            row.add(1);

            for (int j = 1; j < i; j++) {
                int left = allRows.get(i - 1).get(j - 1);
                int right = allRows.get(i - 1).get(j);
                row.add(left + right);
            }

            // add last 1 in each row
            row.add(1);
            allRows.add(row);
        }

        return allRows;
    }

    public static void main(String[] args) {

        System.out.println(generate(5));
    }
}
