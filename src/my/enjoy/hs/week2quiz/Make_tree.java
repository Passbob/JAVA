package my.enjoy.hs.week2quiz;

import java.util.Scanner;

public class Make_tree {

    public void treeMaker(){
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 트리 높이를 숫자로 입력하세요 : ");

        int height = sc.nextInt();


        for(int i = 1; i <= height; i++){
            for(int j = height-i; j >=0; j--){
                System.out.print(" ");
            }
            for(int star = 1; star <= 1+(i-1)*2; star++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("⸜(*ˊᗜˋ*)⸝ 트리가 완성되었습니다!! ");

    }


}
