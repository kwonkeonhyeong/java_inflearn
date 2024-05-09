package lang.enumeration.ex1;

import lang.enumeration.ex0.DiscountService;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;

        lang.enumeration.ex0.DiscountService discountService = new DiscountService();
        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold1 = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 급액: " + basic);
        System.out.println("GOLD 등급의 할인 급액: " + gold1);
        System.out.println("DIAMOND 등급의 할인 급액: " + diamond);
    }
}
