package my.test.com.ogiraffer.date0905.level2Normal;

import java.util.Scanner;

public class NormalMethod {

    public void test1to10(){

        /* 1~10 사이의 정수 한개를 입력받아 홀수인지 짝수인지 인지 확인하고,
         * 홀수이면 "홀수다.", 홀수가 아니면 "짝수다." 라고 출력하세요.
         * 단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야 합니다." 를 출력하세요.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요. : ");
        int num = sc.nextInt();

        if(num <1 || num > 10){
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
        }else if(num%2 != 0){
            System.out.println("홀수다.");
        }else {
            System.out.println("짝수다.");
        }
    }

    public void BMI(){

        /* BMI(신체질량지수)를 계산하고, 계산된 값에 따라
         * 저체중(20 미만)인 경우 "당신은 저체중 입니다.",
         * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.",
         * 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.",
         * 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요
         *
         * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
         *
         * 계산 예시) BMI = 67 / (1.7 * 1.7)
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("안녕하세요 BMI를 구하는 프로그램입니다.");
        System.out.print("당신의 키(m)를 입력해주세요. : ");
//        cm으로 바꾸자
        double height = sc.nextDouble();
        System.out.print("당신의 몸무게(kg)를 입력해주세요. : ");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("bmi = " + bmi);
        if(0<=bmi && bmi < 20){
            System.out.println("당신은 저체중 입니다.");
        }else if((bmi >= 20) && (bmi < 25)){
            System.out.println("당신은 정상체중 입니다.");
        }else if((bmi >= 25) && (bmi < 30)){
            System.out.println("당신은 과체중 입니다.");
        }else if(bmi < 0){
            System.out.println("입력값을 다시 확인해주세요.");
        }else {
            System.out.println("당신은 비만 입니다.");
        }

    }


}
