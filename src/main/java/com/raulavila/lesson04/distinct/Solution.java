package com.raulavila.lesson04.distinct;

import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int length = array.length;

        if (length == 0) {
            return 0;
        }

        Arrays.sort(array);

        int result = 1;
        int last = array[0];

        for (int i = 1; i < length; i++) {
            int elem = array[i];

            if (elem != last) {
                last = elem;
                result++;
            }
        }

        return result;
    }
}
