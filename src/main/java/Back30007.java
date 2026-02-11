import java.util.Scanner;

public class Back30007 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int hap = a*(c-1)+b;

            System.out.println(hap);
        }




    }
}
