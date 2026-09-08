package Programmers;

public class Prog181939 {
    public int solution(int a, int b) {
        int answer = 0;
        int c = a;
        int d = b;
        for (int i = 0; i<String.valueOf(a).length() ; i++){
            d = d*10;
        }
        for (int i = 0; i<String.valueOf(b).length() ; i++){
            c = c*10;
        }
        if (a+d>= b+c){
            answer = a+d;
        }else{
            answer = b+c;
        }
        return answer;
    }
}
