import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back11365 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();

            if (str.equals("END")) { // END 나오면 종료
                break;
            }

            // 문자열 뒤집기
            StringBuilder sb = new StringBuilder(str);
            System.out.println(sb.reverse().toString());
        }


    }
}
