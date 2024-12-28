package leetcode.DS2.array;

import java.util.Arrays;

/*

https://leetcode.com/problems/majority-element/description/
solution: https://leetcode.com/problems/majority-element/solutions/51611/java-solutions-sorting-hashmap-moore-voting-bit-manipulation/
 */
public class Majority_Element {

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
