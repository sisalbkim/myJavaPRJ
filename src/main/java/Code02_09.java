public class Code02_09 {
    public static void main(String[] args){

        int number1 = 10, number2 = 20;
        int resAdd;
        int resSub;
        int resMul;
        double resDiv;

        resAdd = number1 + number2;
        resSub = number1 - number2;
        resMul = number1 * number2;
        resDiv = (double) number1 / number2;

        System.out.println(number1 + " + " + number2 + " = " + resAdd);
        System.out.println(number1 + " - " + number2 + " = " + resSub);
        System.out.println(number1 + " * " + number2 + " = " + resMul);
        System.out.println(number1 + " / " + number2 + " = " + resDiv);
// int는 정수형 변수지정, 그래서 나누기값이 0으로나옴.
// 그러니까 실수형 변수지정인 double로 지정해야함.
//        ㅋㅋ 근데 4번문항이 정수+정수라서 답을 실수로 지정해도 정수 답이 나옴.
//        그니까 아예 처음부터 double number1 같은 실수로 지정하던가,
//        13번탭에서 실수 임시지정을 해줘야하는듯
//        실수 임시지정은 resDiv = (double) number1 / number2
    }
}
