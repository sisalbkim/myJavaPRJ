import java.util.Scanner;

public class Back02675 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[]x = new String[n];
        for (int a = 0; a < n; a++) {
            int m = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int leg = s.length();
            char[]c = new char[leg];
            for (int i = 0; i < leg; i++) {
                c[i] = s.charAt(i);
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    for (int k = 0; k < leg; k++) {
                        x[a] = x[a] + c[j];
                    }
                }



            }
        }for (int a = 0; a < n; a++) {
            System.out.println(x[a]);
        }
    }
}
