import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Back18883 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" "); // 한 줄 입력
        int a = Integer.parseInt(input[0]);        // N
        int b = Integer.parseInt(input[1]);        // M

        int c = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                sb.append(c);
                c++;
                if (j != b - 1) sb.append(" "); // 줄 끝에는 공백 제거
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
