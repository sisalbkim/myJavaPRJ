import java.util.Scanner;

public class Back11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            int remainder = N % B;
            if (remainder < 10) {
                sb.append((char) ('0' + remainder));
            } else {
                sb.append((char) ('A' + (remainder - 10)));
            }
            N /= B;
        }

        System.out.println(sb.reverse());
    }
}