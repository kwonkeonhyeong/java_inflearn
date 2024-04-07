package lang.immutable.address;

public class primitiveMain {
    public static void main(String[] args) {
        // 기본형은 절대로 같은 값을 공유하지 않는다
        int a = 10;
        int b = a; // a -> b, 값 복사 후 대입
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;
        System.out.println("20 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 기본형 변수 a와 b는 절대로 하나의 값을 공유하지 않는다.
        // b = a 라고 하면 자바는 항상 값을 복사해서 대입한다.
        // 결과적으로 a 와 b는 둘다 10 이라는 똑같은 숫자의 값을 가지지만 사로 다른 10이다.
        // 메모리 상에서도 a에 속하는 10과 b에 속하는 10이 각각 별도로 존재한다.
    }
}
