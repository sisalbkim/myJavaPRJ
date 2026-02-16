import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Back34691 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, String> map = new HashMap<>();
        map.put("animal", "Panthera tigris");
        map.put("flower", "Forsythia koreana");
        map.put("tree", "Pinus densiflora");
        String subject = sc.nextLine();
        while(!subject.equals("end")){

            System.out.println(map.get(subject));
            subject = sc.nextLine();

        }
    }
}
