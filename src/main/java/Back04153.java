import java.util.Arrays;
import java.util.Scanner;

public class Back04153 {
    public static void main(String[] args) {

        Integer[] arr = new Integer[3];
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 입력 받기
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }

            // 0 0 0 이 입력되면 종료
            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;

            // 정렬 (오름차순)
            Arrays.sort(arr);

            // 피타고라스 정리 검사: 작은 두 변 제곱 합 == 가장 긴 변 제곱
            if (arr[0]*arr[0] + arr[1]*arr[1] == arr[2]*arr[2]) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}