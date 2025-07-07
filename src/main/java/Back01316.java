import java.util.Scanner;

public class Back01316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 단어 개수
        int notGroupCount = 0;

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            boolean[] visited = new boolean[26];
            boolean isGroupWord = true;

            char prev = word.charAt(0);
            visited[prev - 'a'] = true;

            for (int j = 1; j < word.length(); j++) {
                char now = word.charAt(j);

                if (now != prev) {
                    if (visited[now - 'a']) {
                        isGroupWord = false;
                        break;
                    }
                    visited[now - 'a'] = true;
                }

                prev = now;
            }

            if (!isGroupWord) {
                notGroupCount++;
            }
        }

        System.out.println(n - notGroupCount); // 그룹 단어 개수 출력
    }
}

