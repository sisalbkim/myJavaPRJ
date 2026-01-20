import java.util.Scanner;

public class Back28074 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        boolean m = false, o = false, b = false, i = false, s = false;

        char[] arr = n.toCharArray();

        for (char c : arr) {
            if (c == 'M') m = true;
            else if (c == 'O') o = true;
            else if (c == 'B') b = true;
            else if (c == 'I') i = true;
            else if (c == 'S') s = true;
        }

        if (m && o && b && i && s) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
