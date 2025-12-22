import java.util.Objects;
import java.util.Scanner;

public class Back28235 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = "";

        if(Objects.equals(a, "SONGDO")){
            b=("HIGHSCHOOL");
        } else if (Objects.equals(a, "CODE")) {
            b=("MASTER");
        } else if (Objects.equals(a, "2023")) {
            b=("0611");
        } else if (Objects.equals(a, "ALGORITHM")) {
            b=("CONTEST");
        }
        System.out.println(b);


    }
}
