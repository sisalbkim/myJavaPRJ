public class Homecode_33 {
    public static void main(String[] args) {

        int x = 20; // 1 0 1 0 0
        int a = 2;
        int r1 = x >> a; // : 이진수 x를 a 비트 오른쪽으로 이동합니다. 왼쪽의 비는 공간은 부호로 채웁니다.
        int r2 = x >>> a; // : 이진수 x를 a비트 오른쪽으로 이동합니다. >>>는 왼쪽의 비는 공간을 0으로 채웁니다.
        int r3 = x << a; // : 이진수 x를 a비트 왼쪽으로 이동합니다. 오른쪽에 비는 공간은 0으로 채웁니다.

        System.out.println("r1 : " + r1);
        System.out.println("r2 : " + r2);
        System.out.println("r3 : " + r3);

    }
}
