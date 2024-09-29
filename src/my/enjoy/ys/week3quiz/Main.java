package my.enjoy.ys.week3quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        문제: 배열에서 최대값과 최소값 찾기
//
//        사용자로부터 배열의 크기를 입력받고, 해당 크기만큼 정수를 입력받아 배열에 저장한 후 다음 작업을 수행하는 프로그램을 작성하세요.
//
//                요구사항:
//
//
//        사용자로부터 배열의 크기를 입력받습니다 (1 이상의 정수).
//        배열의 크기만큼 정수를 입력받아 배열에 저장합니다.
//        배열에 저장된 요소들 중에서 최대값과 최소값을 찾아 출력합니다.
//        최대값과 최소값의 위치(인덱스)도 함께 출력합니다.
//
//                출력 예시 배열의 크기를  5로 잡고 정수로 3, 1, 9, 7, 5 를 입력하면
//        최대값: 9, 위치: 2
//        최소값: 1, 위치: 1


        Scanner sc = new Scanner(System.in);
        int min;
        int max;
        int minIndex = 0;
        int maxIndex = 0;
        int length = sc.nextInt();
        int[] arr = new int[length];
        int[] arrM;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        arrM = Arrays.copyOf(arr, length);
        Arrays.sort(arrM);
        min = arrM[0];
        max = arrM[arrM.length - 1];


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == min) {
               minIndex = i;
            }else if (arr[i] == max) {
                maxIndex = i;
            }
        }

        System.out.println("최대값 : " + max + " 위치 : " + maxIndex);
        System.out.println("최소값 : " + min + " 위치 : " + minIndex);


    }

}
