package leetcode.DS2.array;

import java.util.HashMap;
import java.util.HashSet;

/*
https://leetcode.com/problems/single-number/

solution: https://leetcode.com/problems/single-number/solutions/1184007/3-different-java-solutions-with-explanations/
 */
public class Single_Number {

//    1st way
    public static int singleNumber(int[] nums) {

        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int n : nums) {
            hmap.put(n, hmap.getOrDefault(n, 0) + 1);
        }

        for (int n : nums) {
            if (hmap.get(n).equals(1))
                return n;
        }
        return 0;
    }

//    2nd way
    /*
    Bitwise 'XOR' gives zero when both inputs are same.
    And if we apply XOR for 'zero' and 'any number', it will give output as that number itself.
    So if the array is {4,1,2,1,2} then 'XOR' operation is ((2^2)^(1^1)^(4)) => (0^0^4) => 4
     */

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
        System.out.println(singleNumber(new int[]{1}));
    }

}
