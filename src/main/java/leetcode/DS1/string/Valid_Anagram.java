package leetcode.DS1.string;

/*
https://leetcode.com/problems/valid-anagram/
solution: similar to ransom note problem

 */
public class Valid_Anagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            if (arr[c - 'a'] == 0) {
                return false;
            } else {
                arr[c - 'a']--;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram", "nagaram"));

        System.out.println(isAnagram("rat", "car"));
    }
}
