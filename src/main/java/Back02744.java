import java.util.Scanner;

public class Back02744 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] a = str.toCharArray();

        for  (int i = 0; i < a.length; i++) {
            if (a[i]>96){
                a[i] -= 32;
            } else if (a[i]<96) {
                a[i] += 32;
            }
        }
        System.out.println(a);
    }
}
