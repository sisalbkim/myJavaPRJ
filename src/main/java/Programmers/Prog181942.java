package Programmers;

public class Prog181942 {
    public String solution(String str1, String str2) {
        String answer = "";
        char[] str11 = str1.toCharArray();
        char[] str22 = str2.toCharArray();
        for (int i = 0; i < str2.length(); i++){
            answer = (answer + str11[i] + str22[i]);
        }
        return answer;
    }
}
