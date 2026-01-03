import java.util.Scanner;

public class Back20492 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = (a*78/100);
        int c = a-(a*20/100)*22/100;


        System.out.println(b+" "+c);

    }
}
