import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Back11945 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            System.out.println(new StringBuilder(s).reverse());
        }
    }
}