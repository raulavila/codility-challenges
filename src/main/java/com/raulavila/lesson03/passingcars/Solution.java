package com.raulavila.lesson03.passingcars;

class Solution {
    public int solution(int[] input) {
        int west = 0;
        int count = 0;

        for(int i=input.length-1; i>=0; i--) {
            if(input[i] == 1)
                west++;
            else
                count+=west;

            if(count > 1_000_000_000)
                return -1;
        }
        return count;
    }
}