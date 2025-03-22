public class Homecode_24 {
    public static void main(String[] args){

        int n = 20000;
        int day = n / (24 * 60 * 60);
        int hour = n / (60 * 60) % 24;
        int minute = (n / 60) % 60;
        int second = n % 60;

        System.out.println(day + "일" + hour + "시간" + minute + "분" + second + "초");
    }
}
