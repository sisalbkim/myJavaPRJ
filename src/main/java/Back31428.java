import java.util.Scanner;

public class Back31428 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int hap = 0;
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        char a = sc.next().charAt(0);
        for (int i = 0; i < n; i++) {
            if (arr[i] == a) {
                hap++;
            }
        }
        System.out.println(hap);

    }
}
