import java.util.Scanner;

public class Back32775 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a<=b){
            System.out.println("high speed rail");
        }else if (a>b){
            System.out.println("flight");
        }
    }
}
