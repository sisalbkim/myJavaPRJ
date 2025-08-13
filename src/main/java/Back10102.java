import java.util.Scanner;

public class Back10102 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = 0;

        String votes = sc.next();



        for (int i=0;i<n;i++){
            char v = votes.charAt(i);
            if (v =='A'){
                m-=1;
            } else if (v =='B') {
                m+=1;

            }

        }
        if(m<0){
            System.out.println("A");
        }else if(m>0){
            System.out.println("B");
        }else
            System.out.println("Tie");

    }
}
