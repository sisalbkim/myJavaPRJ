import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Back25206 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Double> gradeMap = new HashMap<>();

        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        float hap = 0;

        float plus = 0;

        for (int i = 0; i < 20; i++) {

            String a = sc.next();

            float b = sc.nextFloat();

            String c = sc.next();

            if (!c.equals("P")) {
                hap += b*gradeMap.get(c);
                plus += b;
            }
        }

        System.out.println(hap/plus);

    }
}
