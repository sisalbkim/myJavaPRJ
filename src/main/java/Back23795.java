import java.util.Scanner;

public class Back23795 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hap = 0;
        while (sc.hasNext()) {

            int n = sc.nextInt();

            if (n == -1) {
                break;
            }
            hap += n;
        }
        System.out.println(hap);

    }

}
