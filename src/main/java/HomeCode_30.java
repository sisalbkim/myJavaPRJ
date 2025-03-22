public class HomeCode_30 {
    public static void main(String[] args) {

        int a = 11; // 1 0 1 1
        int b = 13; // 1 1 0 1

        int c = a & b; // 연산자 AND, 둘다 1일때만 1 , 나머지는 0을 출력
        System.out.println("c : " + c); // 1 0 0 1

        int d = a | b; // 연산자 OR, 둘다 0일때만 0 , 1이 하나라도 있으면 1을 출력.
        System.out.println("d : " + d); // 1 1 1 1

        int e = a ^ b; // 연산자 XOR, 두개의 코드가 다를 경우에만 1을 출력, 나머지는 0을 출력.
        System.out.println("e : " + e); // 0 1 1 0


    }
}
