import java.util.Scanner;

public class Back08958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {

            String str = sc.next();
            char[] arr = str.toCharArray();

            int score = 0;
            int total = 0;

            for (char c : arr) {
                if (c == 'O'){
                    score ++;
                    total += score;
                } else {
                    score = 0;
                }


            }
            System.out.println(total);

        }
    }
}
