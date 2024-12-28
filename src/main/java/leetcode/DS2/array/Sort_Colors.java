package leetcode.DS2.array;

import java.util.Arrays;

/*
https://leetcode.com/problems/sort-colors/description/
solution:
1-pass: https://www.youtube.com/watch?v=uvB-Ns_TVis
2-pass https://leetcode.com/problems/sort-colors/solutions/26549/java-solution-both-2-pass-and-1-pass/

 */
public class Sort_Colors {

    public static void sortColors(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
        int index = 0;
        while (index <= end && start < end) {
            if (nums[index] == 0) {
                nums[index] = nums[start];
                nums[start] = 0;
                start++;
                index++;
            } else if (nums[index] == 2) {
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
            } else {
                index++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        sortColors(new int[]{2, 0, 2, 1, 1, 0});
    }
}
