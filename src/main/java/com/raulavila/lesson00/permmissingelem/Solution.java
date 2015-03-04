package com.raulavila.lesson00.permmissingelem;

import java.util.Arrays;

// https://codility.com/c/intro/demo7ADNUY-RSH
public class Solution {

    public int solution(int[] input) {
        long N = input.length + 1;
        
        long total = (N * (N+1)) / 2;
        
        long sum = 0L;
        for (int number : input) {
            sum = sum + number;
        }

        return (int)(total - sum);
    }

    public int solution2(int[] input) {
        Arrays.sort(input);

        for (int i = 0; i < input.length; i++) {
            int expected = i + 1;
            if (input[i] != expected) {
                return expected;
            }
        }
        
        return input.length + 1;
    }
    
    public static void main(String[] args) {
        int[] input = {2, 3, 1, 5};
        Solution solution = new Solution();
        int result = solution.solution2(input);
        System.out.println(result);

    }
}
