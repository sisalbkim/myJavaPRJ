import java.util.Scanner;

public class Back31994 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "";
        int high = 0;

        for (int i=0; i<7; i++ ){
            String a = sc.next();
            int b = sc.nextInt();
            if (high<b){
                high=b;
                str=a;
            }
        }
        System.out.println(str);




    }
}
