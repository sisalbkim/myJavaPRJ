import java.util.Scanner;

public class Back29699 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[] a = "WelcomeToSMUPC".toCharArray();

        n = n-1;
        n = n%14;



        System.out.println(a[n]);

    }
}
