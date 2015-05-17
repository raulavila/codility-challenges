package com.raulavila.lesson03.minavgtwoslice;

import java.lang.Math;

class Solution {
    public int solution(int[] input) {
        int length = input.length;

        if(length == 2)
            return 0;

        double minAvg = Double.MAX_VALUE;

        int result = 0;

        for(int i=0;i < length - 2;i++){
            double avg1 = (input[i] + input[i+1]) / 2.0;
            double avg2 = (input[i] + input[i+1] + input[i+2]) / 3.0;

            double avg = Math.min(avg1, avg2);

            if(avg < minAvg) {
                minAvg = avg;
                result = i;
            }
        }

        double avg = (input[length-2] + input[length-1]) / 2.0;

        if(avg < minAvg)
            result = length - 2;

        return result;
    }
}
