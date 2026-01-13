import java.util.Scanner;

public class Back30868 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = a/5;
            int c = a%5;
            for(int j = 0; j < b; j++){
                System.out.print("++++ ");
            }
            for(int j = 0; j < c; j++){
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
