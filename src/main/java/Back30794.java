import java.util.Objects;
import java.util.Scanner;

public class Back30794 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        String b = sc.next();

        if (Objects.equals(b, "miss")){
            System.out.println("0");
        } else if (Objects.equals(b, "bad")) {
            System.out.println(a*200);
        } else if (Objects.equals(b, "cool")) {
            System.out.println(a*400);
        } else if (Objects.equals(b, "great")) {
            System.out.println(a*600);
        } else if (Objects.equals(b, "perfect")) {
            System.out.println(a*1000);
        }

    }
}
