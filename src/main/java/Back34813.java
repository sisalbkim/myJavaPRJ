import java.util.Scanner;

public class Back34813 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        char a1 = a.charAt(0);

        if (a1 == 'F'){
            System.out.println("Foundation");
        }else if (a1 == 'C'){
            System.out.println("Claves");
        }else if (a1 == 'V'){
            System.out.println("Veritas");
        }else if (a1 == 'E'){
            System.out.println("Exploration");
        }
    }
}
