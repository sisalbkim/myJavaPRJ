import java.util.Scanner;

public class Homecode49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = 0;
        if (a > b) max = a;
        else max = b;

        if (c > max) max = c;

        System.out.println("max : " + max);
        sc.close();
    }
}
