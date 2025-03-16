import java.util.Scanner;
public class Code02_10 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int num;

        num = s.nextInt();
        System.out.println("사용자가 입력한 값 ==>" + num);
//이건 숫자 누르라고 얘기 안해주면 모르겠는데.
        s.close();


    }
}
