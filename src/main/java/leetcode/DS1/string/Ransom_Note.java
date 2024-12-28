package leetcode.DS1.string;

/*
https://leetcode.com/problems/ransom-note/
reference:
https://leetcode.com/problems/ransom-note/solutions/2475884/c-java-easy-solution-beginner-friendly-best-method/
https://leetcode.com/problems/ransom-note/solutions/2476543/c-python-java-easy-and-fast/
 */
public class Ransom_Note {
    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] arr = new int[26];

        for (char i : magazine.toCharArray()) {
            arr[i - 'a']++;
        }
        for (char i : ransomNote.toCharArray()) {
            if (arr[i - 'a'] == 0) {
                return false;
            } else {
                arr[i - 'a']--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }
}
