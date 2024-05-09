package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
//        Integer boxedValue = Integer.valueOf(value); // 컴파일 단계에서 추가
        Integer boxedValue = value; // 오토 박싱 (Auto-boxing)

        // Wrapper -> Primitive
//        int unboxedValue = boxedValue.intValue(); // 컴파일 단계에서 추가
        int unboxedValue = boxedValue; // 오토 언박싱 (Auto-unboxing)

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
