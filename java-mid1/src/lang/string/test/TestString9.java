package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] part = email.split("@");
        System.out.println("Id: " + part[0] );
        System.out.println("Domain: " + part[1] );
    }
}
