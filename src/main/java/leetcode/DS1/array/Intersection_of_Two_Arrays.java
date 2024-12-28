package leetcode.DS1.array;

import java.util.Arrays;
import java.util.HashSet;
//https://leetcode.com/problems/intersection-of-two-arrays-ii/description/

// referred solution:
// https://leetcode.com/problems/intersection-of-two-arrays-ii/solutions/282372/java-solution-with-all-3-follow-up-questions/

/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 */
public class Intersection_of_Two_Arrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hset = new HashSet<>();
        for (int num1 : nums1)
            hset.add(num1);


        HashSet<Integer> intersections = new HashSet<>();
        for (int num2 : nums2) {
            if (hset.contains(num2))
                intersections.add(num2);
        }

        int[] result = new int[intersections.size()];
        int i = 0;
        for (int temp : intersections) {
            result[i] = temp;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
