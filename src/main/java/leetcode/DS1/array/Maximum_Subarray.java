package leetcode.DS1.array;

//https://leetcode.com/problems/maximum-subarray/description/
// solution is based on kadane's algo

public class Maximum_Subarray {
    public static int maxSubArray(int[] nums) {

        int maxEndHere = nums[0];
        int maxSoFar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEndHere = Math.max(nums[i], maxEndHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {

        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(maxSubArray(new int[]{-1}));
    }
}
