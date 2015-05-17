package com.raulavila.lesson04.triangle;

import java.util.Arrays;

public class Solution {
    public int solution(int[] array) {
        int length = array.length;

        if (length < 3)
            return 0;

        Arrays.sort(array);

        for (int i = 0; i < length - 2; i++) {
            int elem1 = array[i];
            int elem2 = array[i + 1];
            int elem3 = array[i + 2];

            long sum = (long)elem1 + elem2;

            if (sum > elem3)
                return 1;

        }

        return 0;
    }
}