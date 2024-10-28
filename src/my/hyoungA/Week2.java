package my.hyoungA;

import java.util.Scanner;

public class Week2 {

    public static void main(String[] args) {

        Week2 go = new Week2();

//        수완 문제
//        go.sw1();
//        go.sw2();

//        주혜 문제
//        go.jh1();
//        go.jh2();
//        go.jh3();
//        하은 문제
//        go.he1();
//        go.he2();
//        go.he3();


    }

    public void sw1(){

        int[] numbers = {5, 12, 7, 4, 15, 20, 9, 18, 25, 30};
        int threeMultiple = 0;
        int fiveMultiple = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]%3 == 0){
                threeMultiple++;
            }
            if(numbers[i]%5 == 0){
                fiveMultiple++;
            }
        }

        System.out.println("3의 배수 갯수 = " + threeMultiple);
        System.out.println("5의 배수 갯수 = " + fiveMultiple);
        
        System.out.println("갯수 총합 = " + threeMultiple +fiveMultiple);
    }

    public void sw2(){
        int[] numbers = {5, 12, 7, 4, 3, 20, 15, 8, 2, 9};
        int even = 0;
        int odd = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]%2 == 0){
                even += numbers[i];
            }else {
                odd += numbers[i];
            }
        }
        System.out.println("짝수의 합 = " + even);
        System.out.println("홀수의 합 = " + odd);
    }

    public void jh1(){
        int threeAndSevenMultipleSum = 0;
        int threeAndSevenMultipleCount = 0;

        for(int i = 1; i <= 100; i++){
            if(i%3 == 0 || i%7 == 0){
                threeAndSevenMultipleSum += i;
                threeAndSevenMultipleCount++;
            }
        }
        System.out.println("1~100까지 중 3의 배수이거나 7의 배수인 값의 합 = " + threeAndSevenMultipleSum);
        System.out.println("1~100까지 중 3의 배수이거나 7의 배수인 값의 갯수 = " + threeAndSevenMultipleCount);
    }

    public void jh2(){
        int randomNum = (int)(Math.random()*1000 + 1);
        int reverseRandomNum = 0;
        if(10>randomNum){
            reverseRandomNum = randomNum;
        } else if (100>randomNum) {
            int a = randomNum/10;
            int b = randomNum%10;
            reverseRandomNum = b*10 + a;
        } else {
            int a = randomNum/100;
            int b = (randomNum%100)/10;
            int c = randomNum%10;
            reverseRandomNum =c*100 + b*10 + a;
        }

        System.out.println("randomNum = " + randomNum);
        System.out.println("reverseRandomNum = " + reverseRandomNum);

        if(randomNum == reverseRandomNum){
            System.out.println("난수와 난수의 역순이 동일합니다."+randomNum);
        }else{
            System.out.println("난수와 난수의 역순이 동일하지 않습니다.");
        }
    }

    public void jh3(){
        Scanner sc = new Scanner(System.in);
        int randomNum = (int)(Math.random()*100 + 1);
        while (true) {
            System.out.print("1과 100 사이 중 하나의 숫자를 입력해주세요. : ");
            int answer = sc.nextInt();
            if(randomNum == answer){
                System.out.println("정답입니다.");
                break;
            } else if (randomNum > answer) {
                System.out.println("up");
            }else {
                System.out.println("down");
            }
        }
    }

    public void he1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("입력하신 숫자는 짝수입니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }

    public void he2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("입력하신 숫자는 양수입니다.");
        }else if(num < 0){
            System.out.println("입력하신 숫자는 음수입니다.");
        }else{
            System.out.println("0입니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }
    public void he3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int num = sc.nextInt();
        if (num==0) {
            System.out.println("입력하신 숫자는 0입니다. 다른 숫자를 입력해주세요.");
        } else if(num%3 == 0 && num%4 == 0){
            System.out.println("입력하신 "+num+"은(는) 3의 배수이면서 4의 배수입니다.");
        }else if(num%3 == 0){
            System.out.println("입력하신 "+num+"은(는) 3의 배수입니다.");
        }else if(num%4==0){
            System.out.println("입력하신 "+num+"은(는) 4의 배수입니다.");
        } else{
            System.out.println("조건을 만족하는 수가 아닙니다.");
        }
    }
}
