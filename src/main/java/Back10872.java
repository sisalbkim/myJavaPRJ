import java.util.Scanner;

public class Back10872 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int hap = 1;

        for (int i = 1; i <= n; i++) {
            hap = hap * i;

        }
        System.out.println(hap);
    }
}
