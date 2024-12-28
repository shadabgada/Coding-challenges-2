package leetcode.DS1.string;

import java.util.HashMap;

/*
https://leetcode.com/problems/first-unique-character-in-a-string/

 */
public class First_Unique_Character_In_String {
    public static int firstUniqChar(String s) {

        HashMap<Character, Integer> hmap = new HashMap<>();
        char[] sarray = s.toCharArray();
        for (char c : sarray) {
            hmap.put(c, hmap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < sarray.length; i++) {
            if (hmap.get(sarray[i]) == 1)
                return i;
        }

        return -1;
    }


    public static void main(String[] args) {

        // return index of first non repeating character of string
        System.out.println(firstUniqChar("leetcode"));

        System.out.println(firstUniqChar("loveleetcode"));
    }

}
