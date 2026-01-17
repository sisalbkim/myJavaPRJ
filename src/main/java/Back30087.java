import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Back30087 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // 개행 제거

        Map<String, String> map = new HashMap<>();
        map.put("Algorithm", "204");
        map.put("DataAnalysis", "207");
        map.put("ArtificialIntelligence", "302");
        map.put("CyberSecurity", "B101");
        map.put("Network", "303");
        map.put("Startup", "501");
        map.put("TestStrategy", "105");

        for (int i = 0; i < n; i++) {
            String subject = sc.nextLine();
            System.out.println(map.get(subject));
        }
    }
}
