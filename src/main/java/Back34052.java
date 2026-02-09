import java.util.Scanner;

public class Back34052 {
    public static  void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int hap = a+b+c+d;
        if(hap<=1500){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
