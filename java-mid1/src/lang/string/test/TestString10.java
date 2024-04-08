package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mange";
        String[] fruitsSplit = fruits.split(",");
        System.out.println(String.join("-",fruitsSplit));
    }
}
