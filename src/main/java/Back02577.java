import java.util.Scanner;

public class Back02577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = a*b*c;

        int[] f = new int[10];

        String s = String.valueOf(d);
        int []e = new int[s.length()];

        for(int i=0;i<s.length();i++){
            int p =s.charAt(i)-'0';
            f[p]++;
        }

        for(int i = 0; i<10;i++){
            System.out.println(f[i]);
        }




    }
}
