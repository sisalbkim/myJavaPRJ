import java.util.Scanner;

public class Back10807 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int [] b = new int [a];
        for  (int i = 0; i < a; i++) {
            b[i] = s.nextInt();
        }
        int c = s.nextInt();
        int hap = 0;
        for  (int i = 0 ; i < a; i++) {
            if (b[i] == c){
                hap ++;
            }
        }
        System.out.println(hap);

    }
}
