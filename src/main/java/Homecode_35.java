public class Homecode_35 {
    public static void main(String[] args) {

        int a = 10, b = 20, c = 30, d = 15;
        boolean b1 = a > b && c > d; // A && B A와 B가 모두 참일때 참으로 출력
        boolean b2 = a != b || b > c; // A || B A와 B중 하나라도 참일때 참으로 출력
        boolean b3 = a <= b || c <= d; // !A !는 A가 참이면 거짓으로, 거짓이면 참으로 출력
        System.out.println(b1 + " " + b2 + " " + b3);
    }
}
