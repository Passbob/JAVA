package my.test.com.ogiraffer.date0905.level1Basic;

import java.util.Scanner;

public class BasicMethod {


    public void test1() {
        /* 정수를 하나 입력 받아 그 수가 양수이면 "양수다." 라고 출력하고,
         * 양수가 아닌 경우 "양수가 아니다." 라고 출력하세요
         *
         * -- 입력 예시 --
         * 정수를 하나 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 양수다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print(" 정수를 하나 입력하세요 : ");
        int num = sc.nextInt();



        if(num == 0){
            System.out.println("0입니다.");
        } else if(num >0 ){
            System.out.println("양수다.");
        }else {
            System.out.println("양수가 아니다.");
        }

    }
    public void test2(){
        /* 정수를 입력 받아 그 수가 짝수인지 홀수인지 판단해서 결과를 출력하세요
         * 짝수인 경우 "짝수다." 출력, 홀수인 경우 "홀수다." 출력
         *
         * -- 입력 예시 --
         * 정수를 하나 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 홀수다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print(" 정수를 하나 입력하세요 : ");
        int num = sc.nextInt();


        if(num == 0){
            System.out.println("0입니다.");
        } else if(num%2 == 0){
            System.out.println("짝수다.");
        }else {
            System.out.println("홀수다.");
        }
    }
}
