import java.util.Scanner;

public class Back30676 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (620<=n){
            System.out.println("Red");
        } else if (590<=n) {
            System.out.println("Orange");
        } else if (570<=n) {
            System.out.println("Yellow");
        } else if (495<=n) {
            System.out.println("Green");
        } else if (450<=n) {
            System.out.println("Blue");
        } else if (425<=n) {
            System.out.println("Indigo");
        } else {
            System.out.println("Violet");
        }

    }
}
