package my.test.com.ogiraffer.level01.basic;

public class Application {
    public static void main(String[] args) {

        int a = 10;
        int b= 20;

        Calculator calc = new Calculator();

        calc.checkMethod();

        System.out.println("1부터 10까지의 합 : " + calc.sum1to10());

//        calc.checkMaxNumber(10, 20);
        calc.checkMaxNumber(a, b);

//        System.out.println("10과 20의 합은 : " + calc.sumTwoNumber(10,20));
        System.out.println("10과 20의 합은 : " + calc.sumTwoNumber(a,b));

        b= 5;

//        System.out.println("10과 5의 차는 : " + calc.minusTwoNumber(10,5));
        System.out.println("10과 5의 차는 : " + calc.minusTwoNumber(a,b));

    }
}
