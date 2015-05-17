package com.raulavila.lesson04.maxproductofthree;

import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);

        int last = array.length - 1;

        int option1 =  array[last] * array[last - 1] * array[last - 2];
        int option2 = array[0] * array[1] * array[last];

        return Math.max(option1, option2);
    }
}
