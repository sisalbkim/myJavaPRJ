package home;


public class Main{
    static int x = f( );

    static {
        x++;
    }
    static int f( ){
        System.out.print("A");
        return 1;
    }

    public static void main(String[] args){
        System.out.print(x);
    }

}