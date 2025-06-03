import java.util.Scanner;

public class Homecode48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        int max = 0;
        if (a > b) max = a;
        else max = b;

        System.out.println("max : " + max);
        sc.close();

    }
}
