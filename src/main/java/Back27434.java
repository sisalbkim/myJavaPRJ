import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Back27434 {
    static BigInteger prod(int l, int r) {
        if (l > r) return BigInteger.ONE;
        if (l == r) return BigInteger.valueOf(l);
        int m = (l + r) >>> 1;
        return prod(l, m).multiply(prod(m + 1, r));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        System.out.println(prod(1, n));
    }
}
