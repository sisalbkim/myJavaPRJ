import java.util.Scanner;

public class Back28453 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int a = sc.nextInt();
            if (a==300){
                System.out.println("1");
            } else if (a>=275) {
                System.out.println("2");
            } else if (a>=250) {
                System.out.println("3");
            } else  {
                System.out.println("4");
            }
        }
    }
}
