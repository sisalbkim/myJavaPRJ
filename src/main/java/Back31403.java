import java.util.Scanner;

public class Back31403 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String d = String.valueOf(a);
        String e = String.valueOf(b);

        String g = d+e;
        int n =  Integer.parseInt(g);

        System.out.println(a+b-c);
        System.out.println(n-c);
    }
}
