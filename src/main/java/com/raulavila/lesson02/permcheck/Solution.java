package com.raulavila.lesson02.permcheck;

import java.util.Arrays;

// https://codility.com/c/intro/demoZQ9RE3-VT8
class Solution {
    public int solution(int[] input) {
        Arrays.sort(input);

        for(int i=0; i<input.length;i++){
            int expected = i + 1;
            if(input[i] != expected)
                return 0;
        }

        return 1;
    }

    public int solution2(int[] input) {
        int length = input.length;
        int lastPosition = length - 1;
        
        int[] aux = new int[length];

        for (int number : input) {
            int position = number - 1;
            if (position > lastPosition) {
                return 0;
            } else {
                aux[position] = number;
            }
        }

        for (int i = 0; i < length; i++) {
            int expected = i+1;
            if (aux[i] != expected) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] input = {4, 1, 3};
        Solution solution = new Solution();
        System.out.println(solution.solution(input));
    }
}
