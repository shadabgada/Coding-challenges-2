package leetcode.DS2.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
https://leetcode.com/problems/merge-intervals/description/
solution: https://leetcode.com/problems/merge-intervals/solutions/1553054/56-merge-intervals-java-solution/
 */
public class Merge_Intervals {
    public static int[][] merge(int[][] intervals) {

        List<int[]> answer = new ArrayList<>();

        if (intervals.length != 0) {
//            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
            Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

            int start = intervals[0][0];
            int end = intervals[0][1];

            for (int[] arr : intervals) {

                if (arr[0] <= end) {
                    end = Math.max(end, arr[1]);
                } else {
                    answer.add(new int[]{start, end});
                    start = arr[0];
                    end = arr[1];
                }
            }
            answer.add(new int[]{start, end});
        }

        return answer.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
    }

}
