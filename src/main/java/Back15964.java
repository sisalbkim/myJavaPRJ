import java.util.Scanner;

public class Back15964 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long result = c(a,b);
        System.out.println(result);
    }

        public static long c (long a,long b){
            return (a+b)*(a-b);
        }


    }

