package my.enjoy.ys.week2quiz;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 숫자 높이를 입력하세요 : ");

        int height = sc.nextInt();


        for(int i = 1; i <= height; i++){
            for(int j = height-i; j >=0; j--){
                System.out.print(" ");
            }
            for(int num = 1; num <= i; num++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}
