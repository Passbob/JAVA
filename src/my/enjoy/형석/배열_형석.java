package my.enjoy.형석;

import java.util.Scanner;

public class 배열_형석 {

    public static void main(String[] args) {

//        좋아하는 과일 5가지를 배열에 넣고 불러와주세요

        배열_형석 myFavoriteFruit = new 배열_형석();
        myFavoriteFruit.myFruit();

    }

    public void myFruit(){


        String[] favoriteFruit = new String[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < favoriteFruit.length; i++) {
            System.out.print("과일을 입력해주세요 : ");
            String fruit = sc.nextLine();
            favoriteFruit[i] = fruit;
        }

        System.out.println("내가 좋아하는 과일은");
        System.out.print(favoriteFruit[0]+" ");
        System.out.print(favoriteFruit[1]+" ");
        System.out.print(favoriteFruit[2]+" ");
        System.out.print(favoriteFruit[3]+" ");
        System.out.print(favoriteFruit[4]+" ");
        System.out.println();
        System.out.println();


    }
}
