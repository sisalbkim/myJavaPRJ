import java.util.Scanner;

public class Homecode57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i==0)
                count++;
        }
        if (count == 2)
            System.out.println(n +"은 소수입니다.");
        else
            System.out.println(n +"은 합성수입니다.");
    }
}
