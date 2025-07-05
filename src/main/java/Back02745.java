import java.util.Scanner;

public class Back02745 {
    public static int convertToDecimal(String number, int base) {
        return Integer.parseInt(number, base);
    }

    public static void main(String[] args) {

        Scanner s =  new Scanner(System.in);

        String a = s.next();
        int b = s.nextInt();

        int c = Integer.parseInt(a,b);

        System.out.println(c);


    }
}
