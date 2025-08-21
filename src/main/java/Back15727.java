import java.util.Scanner;

public class Back15727 {
    public static  void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = n % 5;
        if (m == 0){
            System.out.println(n/5);
        }else{
            System.out.println(n/5 +1);
        }

    }
}
