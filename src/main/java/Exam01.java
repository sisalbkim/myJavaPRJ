import java.util.Scanner;

public class Exam01{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("첫번째 정수");
        int a = s.nextInt();
        System.out.print("두번째 정수");
        int b = s.nextInt();

        System.out.print((double)a / b);

        s.close();
    }
}

