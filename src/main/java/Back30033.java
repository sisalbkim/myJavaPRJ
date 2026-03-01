import java.util.Scanner;

public class Back30033 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []a = new int[n];
        int []b = new int[n];
        int hap = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(a[i]<=b[i]){
                hap = hap+1;
            }
        }
        System.out.println(hap);
    }
}
