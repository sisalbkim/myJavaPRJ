import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Back32154 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Map<String, String> map = new HashMap<>();

        map.put("1", "11\nA B C D E F G H J L M");
        map.put("2", "9\nA C E F G H I L M" );
        map.put("3", "9\nA C E F G H I L M" );
        map.put("4", "9\nA B C E F G H L M" );
        map.put("5", "8\nA C E F G H L M" );
        map.put("6", "8\nA C E F G H L M" );
        map.put("7", "8\nA C E F G H L M" );
        map.put("8", "8\nA C E F G H L M" );
        map.put("9", "8\nA C E F G H L M" );
        map.put("10", "8\nA B C F G H L M" );

        String subject = sc.nextLine();
        System.out.println(map.get(subject));
    }
}
