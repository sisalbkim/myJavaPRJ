import java.util.Scanner;

public class Back34921 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = 10+2*(25-a+b);

        if (c<0){
            c=0;
        }
        System.out.println(c);
    }
}
