public class HomeCode_29
{
    public static void main(String[] args)
    {
        int a = 10, b = 20, c = 5, d;
        d = a++ + --b + ++c; // d는 10+ 20에서 1이 빠진 19, 5에서 1이 더해진 6을 계산함
//        --a는 계산 전에 1을 빼는것, ++a는 계산 전에 1을 더하는것.
//        a++는 계산 후에 1을 더하는것 , --a는 계산 후에 1을 빼는것.
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        System.out.println("d : " + d);
    }
}
