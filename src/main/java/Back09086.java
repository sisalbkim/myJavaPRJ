import java.util.Scanner;

public class Back09086 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        for (int i = 1; i <= n; i++) {

            String a = s.nextLine();
            System.out.print(a.charAt(0));
            System.out.println(a.charAt(a.length()-1));
        }
    }
}
