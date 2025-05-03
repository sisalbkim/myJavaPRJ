import java.util.Scanner;

public class Back03003 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();
        int f = s.nextInt();

        if (a != 1){
            System.out.print(1-a);
        }else System.out.print(0);
        System.out.print(" ");
        if (b != 1){
            System.out.print(1-b );
        }else System.out.print(0);
        System.out.print(" ");
        if (c != 2){
            System.out.print(2-c );
        }else System.out.print(0);
        System.out.print(" ");
        if (d != 2){
            System.out.print(2-d );
        }else System.out.print(0);
        System.out.print(" ");
        if (e != 2){
            System.out.print(2-e );
        }else System.out.print(0);
        System.out.print(" ");
        if (f != 8){
            System.out.print(8-f );
        }else System.out.print(0);
    }
}
