package leetcode.DS2.array;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/pascals-triangle-ii/

 */
public class Pascals_Triangle_II {

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> allRows = new ArrayList<>();
        allRows.add(List.of(1));

        for (int i = 1; i < rowIndex + 1; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                int left = allRows.get(i - 1).get(j - 1);
                int right = allRows.get(i - 1).get(j);
                row.add(left + right);
            }

            row.add(1);
            allRows.add(row);
        }

        return allRows.get(rowIndex);
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
}
