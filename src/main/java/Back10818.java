import java.util.Scanner;

public class Back10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int []b = new int[a];

        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        int min = 0;
        int max = 0;
        for (int i = 0; i < a; i++) {
            if(i == 0){
                min = b[i];
                max = b[i];
            }else if(b[i] < min){
                min = b[i];
            }else if(b[i] > max){
                max = b[i];
            }
        }System.out.print(min + " " + max);

    }
}
