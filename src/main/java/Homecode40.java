public class Homecode40 {
    public static void main(String[] args) {
        byte bi,bj;
        int i = 100, j = 300;

        bi = (byte)i;
        System.out.println("bi :" + bi);
        bj = (byte)j;
        System.out.println("bj :" + bj);
        // byte는 -127~128까지밖에 저장이 안돼서 300은 추가값을 잘라버림
        // 300 (10진수) → 0001 0010 1100 (2진수, 12비트)
        // → 하위 8비트만 취함: 0010 1100
        // → 2진수 0010 1100 = 44 (10진수)
    }
}
