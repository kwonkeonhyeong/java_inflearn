package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        Integer i = Integer.parseInt(str);
        System.out.println("i = " + i);

        int i1 = i.intValue();
        System.out.println("i1 = " + i1);

        Integer i2 = Integer.valueOf(i1);
        System.out.println("i2 = " + i2);
    }
}
