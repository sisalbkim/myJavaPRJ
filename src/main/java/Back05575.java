import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back05575 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) { // 3줄 입력받기
            String[] input = br.readLine().split(" "); // 띄어쓰기 기준 분리

            int h1 = Integer.parseInt(input[0]);
            int m1 = Integer.parseInt(input[1]);
            int s1 = Integer.parseInt(input[2]);
            int h2 = Integer.parseInt(input[3]);
            int m2 = Integer.parseInt(input[4]);
            int s2 = Integer.parseInt(input[5]);

            // 초 단위 변환
            int start = h1 * 3600 + m1 * 60 + s1;
            int end   = h2 * 3600 + m2 * 60 + s2;

            int diff = end - start;

            int h = diff / 3600;
            diff %= 3600;
            int m = diff / 60;
            int s = diff % 60;

            System.out.println(h + " " + m + " " + s);
        }
    }
}
