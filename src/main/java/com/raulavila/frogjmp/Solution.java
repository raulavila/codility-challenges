package com.raulavila.frogjmp;

// https://codility.com/c/intro/demoEXCRU2-BM3
public class Solution {

    public int solution(int x, int y, int d) {
        int distance = y - x;

        int steps = distance / d;

        if(distance % d != 0)
            steps++;

        return steps;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(10, 85, 30);
        System.out.println(result);
    }
}
