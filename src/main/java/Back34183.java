import java.util.Scanner;

public class Back34183 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (n * 3 <= m) {
            System.out.println("0");
        } else {
            System.out.println(((n * 3) - m) * a + b);
        }
    }
}