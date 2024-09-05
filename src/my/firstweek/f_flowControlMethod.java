package my.firstweek;

import java.util.Scanner;

public class f_flowControlMethod {

    public void test1(){


        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 입력 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        int second = sc.nextInt();
        System.out.print("연산기호 입력 (+, - , * , / , %) : ");
        char op = sc.next().charAt(0);

        int result = 0;

        switch (op){
            case '+' :
                result = first + second;
                break;
            case '-' :
                result = first - second;
                break;
            case '*' :
                if(first == 0){
                    System.out.println("0은 곱할 수 없습니다.");
                }else if(second == 0) {
                    System.out.println("0으로 곱할 수 없습니다.");
                } else {
                    result = first * second;
                }
                break;
            case '/' :
                if(first == 0){
                    System.out.println("0은 나눌 수 없습니다.");
                }
                else if(second == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    result = first / second;
                }
                break;
            case '%' :
                if(first == 0){
                    System.out.println("0은 나눌 수 없습니다.");
                } else if(second == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    result = first % second;
                }
                break;
            default :
                System.out.println("해당하는 기호가 없습니다.");
                break;
        } //default는 생략할 수 있지만 주석으로 생략하는 이유를 꼭 적어야한다.


//        현재 %는 first와 second가 0이 아니어도 result가 0이 발생한다. 변수 초기화에는 if문을 못쓰나? 그러면 어떠한 문을 선언할 때는 어떻게 하지?
//        하여튼 삼항연산자로 변수를 선언해서 아래와 같은 식으로 %에서 first와 second가 0이 아니면 정상적으로 나올 수 있도록 만들었다.
        int maybeError = (first == 0)? 0 : (second == 0)? 0 : first / second ;

        if(op == '*' || op == '/'  && result == 0) {
            System.out.println("다시 입력해주세요");
        } else {
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ){
                if(op == '%' && result == 0 && maybeError == 0){
                    System.out.println("다시 입력해주세요");
                }else{
                System.out.println("결과값 : " + result);
                }
            }else {
                System.out.println("다시 입력해주세요");
            }
        }

    }


    public void testSwitchVendingMachine(){

        System.out.println("========ohgiraffers vending machine========");
        System.out.println("==  apple  banana  orange  melon  grape  ==");
        System.out.println("===========================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("과일을 선택해주세여 : ");
        String selectedFruit = sc.nextLine();

        int price = 0;
        String order = "";

        if("apple".equals(selectedFruit)){
            order = "apple";
            price = 1000;
        }else if("banana".equals(selectedFruit)){
            order = "banana";
            price = 1500;
        }else if("orange".equals(selectedFruit)){
            order = "orange";
            price = 2000;
        }else if("melon".equals(selectedFruit)){
            order = "melon";
            price = 2500;
        }else if("grape".equals(selectedFruit)){
            order = "grape";
            price = 10000;
        }else{
            System.out.println("해당 과일이 없습니다.");
        }
        if(order == "apple" || order == "grape" || order == "orange" || order == "melon" || order == "grape") {
            System.out.println(order + "를 선택하셨습니다.");
            System.out.println(price + "원을 투입해주세요.");
        }
    }






}
