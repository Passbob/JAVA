package my.baekjoon.date0926;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double day = sc.nextInt();
        double night = sc.nextInt();
        double top = sc.nextInt();

        int date = (int)Math.ceil((top - day)/(day - night)) +1;

        System.out.println(date);
    }
}
