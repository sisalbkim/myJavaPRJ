import java.util.Scanner;

public class Back32642 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long c = 0;
        long hap = 0;

        for (int i = 0; i < a; i++) {
            long b = sc.nextLong();
            if (b==1){
                c=c+1;
            }else if (b==0){
                c=c-1;
            }
            hap=hap+c;
        }
        System.out.println(hap);
    }
}
