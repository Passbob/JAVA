package my.baekjoon.date0925;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* 뒤집힌 덧셈

        어떤 수 X가 주어졌을 때, X의 모든 자리수가 역순이 된 수를 얻을 수 있다. Rev(X)를 X의 모든 자리수를 역순으로 만드는 함수라고 하자.
        예를 들어, X=123일 때, Rev(X) = 321이다. 그리고, X=100일 때, Rev(X) = 1이다.
        두 양의 정수 X와 Y가 주어졌을 때, Rev(Rev(X) + Rev(Y))를 구하는 프로그램을 작성하시오


        */

        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int printX = sc.nextInt();
        int printY = sc.nextInt();
        if(printX <= 1000) {
            x = printX;
        }
        if(printY <= 1000) {
            y = printY;
        }


        System.out.println(REV(REV(x)+REV(y)));
    }

    public static int REV(int a) {
        int b = 0;


        if(a>999){
            int q = a/1000;
            int w = (a%1000)/100;
            int e = (a%100)/10;
            int r = a%10;

            b= r*1000 + e*100 + w*10 + q;

        } else if (a>99){
            int q = a/100;
            int w = (a%100)/10;
            int e = a%10;

            b= e*100 + w*10 + q;

        }else if(a>9){
            int q = a/10;
            int w = a%10;

            b= w*10 + q;

        }else if(a>0){
            b=a;
        }

        return b;


    }
}
