import java.util.Scanner;

public class Back02720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            int b = sc.nextInt();
            int q = b/25;
            b = b%25;

            int d = b/10;
            b = b%10;

            int n = b/5;
            b = b%5;

            int p = b;

            System.out.println(q + " " + d + " " + n + " " + p);

        }

    }
}
