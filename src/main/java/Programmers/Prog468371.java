package Programmers;

public class Prog468371 {
    public int solution(int[][] signals) {
        int maxTime = 1;

        // 모든 신호등 주기의 최소공배수 구하기
        for (int i = 0; i < signals.length; i++) {
            int cycle = signals[i][0] + signals[i][1] + signals[i][2];
            maxTime = lcm(maxTime, cycle);
        }

        // 1초부터 전체 패턴이 반복될 때까지 확인
        for (int t = 1; t <= maxTime; t++) {

            boolean allYellow = true;

            for (int i = 0; i < signals.length; i++) {

                int g = signals[i][0];
                int y = signals[i][1];
                int r = signals[i][2];

                int cycle = g + y + r;

                // 현재 주기 안에서 몇 번째 초인지
                int pos = (t - 1) % cycle + 1;

                // 노란불 구간이 아니면
                if (!(pos > g && pos <= g + y)) {
                    allYellow = false;
                    break;
                }
            }

            if (allYellow) {
                return t;
            }
        }

        return -1;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
