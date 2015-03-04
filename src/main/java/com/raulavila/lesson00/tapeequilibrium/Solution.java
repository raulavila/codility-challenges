package com.raulavila.lesson00.tapeequilibrium;

// https://codility.com/c/intro/demoQRKBDB-Y3U
public class Solution {

    public int solution(int[] input) {

        long total = 0;
        for (int i = 0; i < input.length; i++) {
            total = total + input[i];
        }

        long minimum = Integer.MAX_VALUE;

        long sumsLeft = 0;
        for (int i = 0; i < input.length - 1; i++) {
            sumsLeft = sumsLeft + input[i];
            long sumsRight = total - sumsLeft;

            long difference = Math.abs(sumsLeft - sumsRight);

            if (difference < minimum)
                minimum = difference;
        }

        return (int) minimum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input = {3, 1, 2, 4, 3};
        int result = solution.solution(input);
        System.out.println(result);
    }
}
