package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int result = 0;

        while(str.indexOf(key) != -1) {
            str = str.substring(str.indexOf(key) + key.length());
            result++;
        }

        System.out.println(result);
    }
}
