package my.test.com.ogiraffer.date0905.level3Hard;

import java.util.Scanner;

public class HardMethod {

    public void test1() {


        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 입력 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        int second = sc.nextInt();
        System.out.print("연산기호 입력 (+, - , * , / , %) : ");
        char op = sc.next().charAt(0);

        int result = 0;

        switch (op) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                if (first == 0) {
                    System.out.println("0은 곱할 수 없습니다.");
                } else if (second == 0) {
                    System.out.println("0으로 곱할 수 없습니다.");
                } else {
                    result = first * second;
                }
                break;
            case '/':
                if (first == 0) {
                    System.out.println("0은 나눌 수 없습니다.");
                } else if (second == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    result = first / second;
                }
                break;
            case '%':
                if (first == 0) {
                    System.out.println("0은 나눌 수 없습니다.");
                } else if (second == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    result = first % second;
                }
                break;
            default:
                System.out.println("해당하는 기호가 없습니다.");
                break;
        }
        System.out.println(first +" "+ op +" "+ second + " = " + result);
    }

    public void fruit(){

        /* 과일 이름("apple", "banana", "melon", "grape") 중 한 가지를 문자열로 입력하면
         * 해당하는 가격에 맞게 상품명과 가격이 출력되게 하세요.
         * 단, 목록에 없는 과일을 입력 시 "준비된 상품이 없습니다." 출력 후 프로그램 종료
         *
         * -- 상품 가격 --
         * apple :  1000원
         * banana : 3000원
         * melon : 2000원
         * grape : 5000원
         *
         * -- 입력 예시 --
         * 과일 이름을 입력하세요 : banana
         *
         * -- 출력 예시 --
         * banana의 가격은 3000원 입니다.
         * */

        System.out.println("-- 싱싱한 과일 사세요!!  --");
        System.out.println("apple banana melon grape");
        System.out.println("--- 중 하나 고르세요!! ---");

        Scanner sc = new Scanner(System.in);
        System.out.print("어떤거 사실래요? : ");
        String choice = sc.nextLine();

        String fruit = "";
        int price = 0;

        switch (choice){
            case "apple" :
                fruit = "apple";
                price = 1000;
                break;
            case "banana" :
                fruit = "banana";
                price = 3000;
                break;
            case "melon" :
                fruit = "melon";
                price = 2000;
                break;
            case "grape" :
                fruit = "grape";
                price = 5000;
                break;
            default :
                System.out.println("준비된 상품이 없습니다.");
                break;
        }
        if(fruit == "apple" || fruit == "banana" || fruit == "melon" || fruit == "grape") {
            System.out.println(fruit + "요? " + price + "원입니다.");
        }



    }



}
