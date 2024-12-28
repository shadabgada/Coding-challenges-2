package leetcode.DS1.array;

//https://leetcode.com/problems/two-sum/description/
//https://www.youtube.com/watch?v=BoHO04xVeU0

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (hmap.containsKey(compliment))
                return new int[]{hmap.get(compliment), i};
            hmap.put(nums[i], i);
        }

        // probably this will never be called
        return nums;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));

    }
}
