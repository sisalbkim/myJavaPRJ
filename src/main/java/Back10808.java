import java.util.Scanner;

public class Back10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();   // 문자열 입력

        int[] b = new int[26];  // 알파벳 개수 저장 배열

        // 문자열의 각 문자에 대해
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);   // 문자 하나 꺼내기
            b[ch - 'a']++;          // 해당 알파벳 위치에 +1
        }

        // 출력
        for (int i = 0; i < 26; i++) {
            System.out.print(b[i] + " ");
        }
    }
}