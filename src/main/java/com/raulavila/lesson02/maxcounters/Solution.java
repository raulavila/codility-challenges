package com.raulavila.lesson02.maxcounters;

//https://codility.com/c/intro/demoC6T6RD-C2H
public class Solution {

    public int[] solution(int N, int[] input) {
        int[] counters = new int[N];

        int currentMax = 0;
        int lastMaxCounter = 0;

        int condition = N + 1;

        for (int number : input) {
            if (number == condition) {
                lastMaxCounter = currentMax;
            } else {
                int position = number - 1;

                if (counters[position] < lastMaxCounter)
                    counters[position] = lastMaxCounter + 1;
                else
                    counters[position] = counters[position] + 1;

                if (counters[position] > currentMax)
                    currentMax = counters[position];
            }
        }

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < lastMaxCounter)
                counters[i] = lastMaxCounter;
        }

        return counters;
    }

}