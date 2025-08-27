import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Back02742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(br.readLine());


        StringBuilder sb = new StringBuilder();

        for (int i = a; i >= 1; i--) {

            sb.append(i).append("\n");

        }

        System.out.print(sb);

    }
}
