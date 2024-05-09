package lang.enumeration.ex1;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount("BASIC", price);
        int gold1 = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        System.out.println("BASIC 등급의 할인 급액: " + basic);
        System.out.println("GOLD 등급의 할인 급액: " + gold1);
        System.out.println("DIAMOND 등급의 할인 급액: " + diamond);

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: " + vip);

        // 오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액: " + diamondd);

        // 소문자 입력
        int gold2 = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액: " + gold2);
    }
}
