import java.util.Scanner;

public class Back01978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 입력 개수
        int[] arr = new int[n];  // 입력 숫자들 저장할 배열

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // 숫자들을 배열에 저장
        }

        int count = 0;  // 소수 개수

        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }

        System.out.println(count);  // 결과 출력
    }

    // 소수 판별 함수
    public static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
