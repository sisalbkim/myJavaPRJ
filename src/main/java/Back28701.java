import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back28701 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int sum = 0;
        int sum3 = 0;
        for (int i = 1; i <= a; i++) {

            sum += i;
            sum3 += (i*i*i);

        }

        System.out.println(sum);
        System.out.println(sum*sum);
        System.out.println(sum3);


    }
}
