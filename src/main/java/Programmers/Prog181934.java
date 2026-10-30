package Programmers;

public class Prog181934 {
    public int solution(String ineq, String eq, int n, int m) {
        return ((ineq.equals(">") && n > m)
                || (ineq.equals("<") && n < m)
                || (eq.equals("=") && n == m)) ? 1 : 0;

    }
}
