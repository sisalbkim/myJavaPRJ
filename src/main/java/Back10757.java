import java.math.BigInteger;
import java.util.Scanner;

public class Back10757 {
    public  static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        BigInteger a = s.nextBigInteger();
        BigInteger b = s.nextBigInteger();


        BigInteger hap = a.add(b);;

        System.out.println(hap.toString());


    }
}
