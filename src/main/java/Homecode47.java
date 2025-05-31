import java.util.Scanner;

public class Homecode47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오 : ");
        int n = sc.nextInt();
        System.out.print("실수를 입력하시오 : ");
        double a = sc.nextDouble();
        System.out.print("이름을 입력하시오 : ");
        String name = sc.next();
        System.out.println("x : " + n);
        System.out.println("a : " + a);
        System.out.println("name : " + name);

        sc.close();
    }
}
