package Programmers;

import java.util.Arrays;

public class Prog135808 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        int a = score.length %m;
        for (int i = a; i < score.length; i+= m){

                        answer += score[i]*m;

        }

        return answer;
    }

}
