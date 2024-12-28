package leetcode.DS1.array;

//https://leetcode.com/problems/merge-sorted-array/description/
//solution: https://www.youtube.com/watch?v=C4oBXLr3zos


import java.util.Arrays;

public class Merge_Sorted_Array {

    // Time: o(klogk)
    public static void merge_normal_approach(int[] nums1, int m, int[] nums2, int n) {

        int j = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);

    }

    // o(n)
    // see image
    public static void merge_2_pointer_approach(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1, p2 = n - 1, i = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i--] = nums1[p1--];
            } else {
                nums1[i--] = nums2[p2--];
            }
        }
    }

    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        merge_2_pointer_approach(nums1, m, nums2, n);
        System.out.print("approach 1: ");
        System.out.println(Arrays.toString(nums1));


        nums1 = new int[]{1, 2, 3, 0, 0, 0};
        nums2 = new int[]{2, 5, 6};
        merge_normal_approach(nums1, m, nums2, n);
        System.out.print("approach 2: ");
        System.out.println(Arrays.toString(nums1));


    }
}
