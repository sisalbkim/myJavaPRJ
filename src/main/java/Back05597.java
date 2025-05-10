import java.util.Scanner;

public class Back05597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] n = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int a = sc.nextInt();
            n[a] = true;
        }

        for (int i = 1; i <= 30; i++){
            if (!n[i]){
                System.out.println(i);
            }

        }

    }
}
