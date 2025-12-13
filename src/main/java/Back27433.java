import java.util.Scanner;

public class Back27433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = 1;
        for (int i = 1; i <= n; i++) {
            m = m * i;
        }

        System.out.print(m);
    }
}
