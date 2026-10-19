package Programmers;

public class Prog181943 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        char[] my = my_string.toCharArray();
        char[] over = overwrite_string.toCharArray();
        for (int i = s; i < s + overwrite_string.length(); i++) {
            my[i] = over[i-s];
        }
        answer = new String(my);
        return answer;
    }
}
