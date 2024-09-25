package my.baekjoon.date0925;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
