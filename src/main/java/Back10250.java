import java.util.Scanner;

public class Back10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int h = d%b;
            int w = d/b+1;

            if (h == 0) {
                h = b;
                w -= 1;
            }



            System.out.printf("%d%02d\n",h,w);
        }



    }
}
