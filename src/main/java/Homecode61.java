public class Homecode61 {
    public static void main(String[] args) {
        for (int i = 1; i<=7 ; i++) {
            System.out.println("before nontinue : " + i);
            if (i % 2 == 0)
                System.out.println("****** after continue");
        }
    }
}
