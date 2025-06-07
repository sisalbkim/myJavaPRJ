import java.util.Scanner;

public class Homecode55 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        while(a>0){
            int b = a%10;
            System.out.println(b);
            a /= 10;
        }
        sc.close();
    }
}
