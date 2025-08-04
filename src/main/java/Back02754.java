import java.util.HashMap;
import java.util.Scanner;

public class Back02754 {
    public static void main(String[] args) {

        HashMap<String,Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.3);
        gradeMap.put("A0", 4.0);
        gradeMap.put("A-", 3.7);
        gradeMap.put("B+", 3.3);
        gradeMap.put("B0", 3.0);
        gradeMap.put("B-", 2.7);
        gradeMap.put("C+", 2.3);
        gradeMap.put("C0", 2.0);
        gradeMap.put("C-", 1.7);
        gradeMap.put("D+", 1.3);
        gradeMap.put("D0", 1.0);
        gradeMap.put("D-", 0.7);
        gradeMap.put("F", 0.0);

        Scanner sc = new Scanner(System.in);
        String grade = sc.nextLine();

        // 결과 출력
        if (gradeMap.containsKey(grade)) {
            System.out.println(gradeMap.get(grade));
        } else {
            System.out.println("잘못된 입력입니다.");
        }

        sc.close();
    }



}
