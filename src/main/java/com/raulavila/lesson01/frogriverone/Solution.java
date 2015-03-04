package com.raulavila.lesson01.frogriverone;

// https://codility.com/c/intro/demoBY8S3M-RZV
public class Solution {

    public int solution(int X, int[] A) {
        int[] minutes = new int[X];
        
        for(int i=0; i<minutes.length; i++)
            minutes[i] = -1;

        for (int i = 0; i < A.length; i++) {
            int position = A[i] - 1;

            if (minutes[position] == -1)
                minutes[position] = i;
        }

        int max = Integer.MIN_VALUE;

        for (int minute : minutes) {
            if (minute == -1)
                return -1;
            else {
                if (minute > max)
                    max = minute;
            }
        }

        return max;
    }
}
