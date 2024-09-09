package my.enjoy.호준;

import java.util.Scanner;

public class 배열_호준 {

    public static void main(String[] args) {

//        1~10까지의 정수를 입력했을 때 입력값이 배열의 길이가 되고 그 배열의 길이만큼 생성된 난수가
//        새로운 배열의 길이를 정하게 한 배열을 출력하시오.
//                배열의 내용은 0이겠지만 갯수는 난수에 의해 정해져야 함
//        출력 예시 : 0, 0, 0, 0, 0, 0, 0, 0,
//                (1~10이 아닐 경우 "제대로 된 숫자를 입력해주세요."가 나타나도록 함)

        Scanner sc = new Scanner(System.in);
        System.out.print("1~10의 정수를 입력해주세요 : ");
        int num = sc.nextInt();
        if(num >=1 && num<=10){
            int[] numArray = new int[num];
            int[] randomArray = new int[(int)(Math.random()*num + 1)];
            for (int i = 0; i<numArray.length; i++){
                System.out.print(numArray[i]+" ");
            }
            System.out.println();
            for (int i = 0; i<randomArray.length; i++){
                System.out.print(randomArray[i]+" ");
            }
        }else{
            System.out.println("제대로 된 숫자를 입력해주세요.");
        }



    }

}
