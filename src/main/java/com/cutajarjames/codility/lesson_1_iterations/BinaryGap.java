package com.cutajarjames.codility.lesson_1_iterations;

class BinaryGap {
    public static int solution(int N) {
        // write your code in Java SE 8

        String s = Integer.toBinaryString(N);

        int i=0;
        int cnt=0;
        int max = 0;
        boolean last=false; //check whether we can start counting 0's
        while(i<s.length()){

            if(last && s.charAt(i)=='0'){
                cnt++;
            }
            if(s.charAt(i)=='1'){
                last = true;
                if(max<cnt)
                    max = cnt;
                cnt=0;
            }
            i++;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(solution(9));
        System.out.println(solution(1041));

    }
}