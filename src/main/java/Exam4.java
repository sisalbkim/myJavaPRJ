abstract class Fish{
    abstract void swim();
}

class Goldfish extends Fish{
    void swim(){
        System.out.print("헤엄치고 있습니다");
    }
}






public class Exam4 {
    public static void main(String[] args) {
        Fish f = new Goldfish();
        f.swim();
    }
}
