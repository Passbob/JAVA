package my.enjoy;

import java.util.Random;

public class 메소드_호준 {

    public static void main(String[] args) {

        java.util.Random random = new java.util.Random();
        int randomNum = random.nextInt(16) - 5 ;
        System.out.println("난수의 절대값 = " + Math.abs(randomNum));



    }

}
