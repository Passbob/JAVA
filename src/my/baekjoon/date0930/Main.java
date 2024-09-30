package my.baekjoon.date0930;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int x = 0;
        int y = Math.abs(num1%4 - num2%4);
        if(num1%4 ==0 || num2%4 == 0 && (num1/4 - num2/4)>0) {
            x += 1;
        }else if(num1%4 == 0 || num2%4 == 0 && (num1/4 - num2/4)<0) {
            x += 1;
        }
        x+=Math.abs(num1/4 - num2/4);
        if(num1%4 == 0 && num2%4 == 1 || num2%4 == 0 && num1%4 == 1) {
            y=3;
        } else if (num1%4 == 0 && num2%4 == 3 || num2%4 == 0 && num1%4 == 3) {
            y=1;
        }


        System.out.println(x+y);


    }

}
