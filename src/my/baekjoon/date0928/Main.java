package my.baekjoon.date0928;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            char[] numbers = new char[7];
    String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
        numbers[i] = input.charAt(i);
    }
    //      0 = 48, 1 = 49, 4 = 52, 7 = 55, 9 = 57
        for (int i = 0; i < input.length(); i++) {
        int a = input.length();
        if(i>=1 && numbers[i]<52 && numbers[i] >= 48) {
            numbers[i] = 55;
        }else if(numbers[i]<55 && numbers[i] >= 52) {
            numbers[i] = 52;
        }else if(numbers[i]<57 && numbers[i] >= 55) {
            numbers[i] = 55;
        }else if(numbers[i]>57 && numbers[i] < 48) {
            break;
        }
    }
        for (int i = 0; i < input.length(); i++) {
        System.out.print(numbers[i]);
    }

    }

//    char[] numbers = new char[7];
//    String input = sc.nextLine();
//        for (int i = 0; i < input.length(); i++) {
//        numbers[i] = input.charAt(i);
//    }
//    //      0 = 48, 1 = 49, 4 = 52, 7 = 55, 9 = 57
//        for (int i = 0; i < input.length(); i++) {
//        int a = input.length();
//        if(i>=1 && numbers[i]<52 && numbers[i] >= 48) {
//            numbers[i-1] = 55;
//        }else if(numbers[i]<55 && numbers[i] >= 52) {
//            numbers[i] = 52;
//        }else if(numbers[i]<57 && numbers[i] >= 55) {
//            numbers[i] = 55;
//        }else if(numbers[i]>57 && numbers[i] < 48) {
//            break;
//        }
//    }
//        for (int i = 0; i < input.length(); i++) {
//        System.out.print(numbers[i]);
//    }


}
