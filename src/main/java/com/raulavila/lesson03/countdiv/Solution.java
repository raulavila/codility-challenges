package com.raulavila.lesson03.countdiv;

class Solution {
    public int solution(int A, int B, int K) {
        int count = 0;

        int resultA = A / K;
        int resultB = B / K;

        count = resultB - resultA;

        if(A % K == 0)
            count++;

        return count;
    }
}
