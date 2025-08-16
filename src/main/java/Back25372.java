import java.util.Scanner;

public class Back25372 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();

            if (s.length() > 5 && s.length() < 10) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
