import java.util.Scanner;

public class Back31090 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            int b = sc.nextInt();
            int c = b%100;
            if ((b+1)%c==0){
                System.out.println("Good");
            }else{
                System.out.println("Bye");
            }
        }

        sc.close();
    }
}
