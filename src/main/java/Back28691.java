import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back28691 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0); // 한 글자 입력 받기

        switch (c) {
            case 'M':
                System.out.println("MatKor");
                break;
            case 'W':
                System.out.println("WiCys");
                break;
            case 'C':
                System.out.println("CyKor");
                break;
            case 'A':
                System.out.println("AlKor");
                break;
            case '$':
                System.out.println("$clear");
                break;
            default:
                // 문제에서는 주어지지 않았지만, 혹시 모를 예외 처리
                System.out.println("Unknown");
        }
    }
}
