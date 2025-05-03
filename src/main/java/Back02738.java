import java.util.Scanner;

public class Back02738 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        int [][] x = new int [a][b];

        for (int i = 0 ; i < a ;  i++) {
            for (int j = 0 ; j < b ; j++) {
                x[i][j] = s.nextInt();

            }
        }
        for (int i = 0 ; i < a ;  i++) {
            for (int j = 0 ; j < b ; j++) {
                x[i][j] += s.nextInt();

            }
        }
        for (int i = 0 ; i < a ;  i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(x[i][j] + " ");
            }System.out.println();
        }

    }
}
