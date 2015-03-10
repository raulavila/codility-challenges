package com.raulavila.lesson02.missinginteger;

class Solution {
    public int solution(int[] input) {
        int N = input.length;

        int [] aux = new int[N];

        for(int i=0; i < N; i++) {
            int number = input[i];

            if(number > 0 && number <= N) {
                aux[number-1] = 1;
            }
        }

        for(int i=1; i <= N; i++) {
            if(aux[i-1] == 0) {
                return i;
            }
        }
        return N+1;
    }
}