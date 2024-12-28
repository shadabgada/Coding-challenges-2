package leetcode;

public class test {

    static int solution(int num) {
        String s = Integer.toBinaryString(num);
        int i = 0;
        int maxCount = 0;
        int currCount = 0;
        boolean lastIsOne = false;
        // 1001, 10100
        while (s.length() > i) {
            char c = s.charAt(i);
            if (c == '0' && lastIsOne) {
                currCount++;
            }
            if (c == '1') {
                if (currCount > maxCount) {
                    maxCount = currCount;
                }
                lastIsOne = true;
                currCount = 0;
            }
            i++;
        }
        return maxCount;
    }

    static String formatString(String input, int limit) {

        String output = "";
        int count = 0;
        int indexPtr = 0;
        String[] inputArray = input.split(" ");
        //this is sample  string for testing

        for (int i = 0; i < inputArray.length; i++) {
            count = count + inputArray[i].length() + 1;
            if (count > limit) {
                count = 0;
                indexPtr = i;
                output = output + "\n" + inputArray[indexPtr] + inputArray[i];
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(formatString("this is sample string for testing", 10));
//        System.out.println(solution(9));
//        System.out.println(solution(20));
//        System.out.println(solution(32));
//        System.out.println(solution(1041));
    }
}
