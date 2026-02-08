import java.util.Scanner;

public class Back32929 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();

        if (a%3==0){
            System.out.println("S");
        }else if (a%3==1){
            System.out.println("U");
        }else if (a%3==2){
            System.out.println("O");
        }
    }
}
