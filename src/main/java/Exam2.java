public class Exam2 {
    public static void main(String[] args) {

        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36-0700] \"GET /apache_pb.gif HTTP/1.0\" 200";

        int a = log.indexOf("/a");
        int b = log.indexOf(" ", a);

        System.out.println(log.substring(a,b));


    }
}
