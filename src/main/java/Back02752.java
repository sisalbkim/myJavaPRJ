import java.util.Arrays;
import java.util.Scanner;

public class Back02752 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int [] d ={a,b,c};
        Arrays.sort(d);
        System.out.println(d[0]+" "+d[1]+" "+d[2]);

    }
}
