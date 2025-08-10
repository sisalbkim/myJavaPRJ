import java.util.Scanner;

public class Back02869 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if (c <= a) {
            System.out.println(1);
            return;
        }

        long day = (c - a + (a - b - 1)) / (a - b) + 1;
        System.out.println(day);


    }
}
