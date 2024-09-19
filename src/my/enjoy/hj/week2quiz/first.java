package my.enjoy.hj.week2quiz;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] member = new String[5];
        System.out.println("이름을 입력하세요.");
        member[0] = sc.nextLine();
        System.out.println("성별을 입력하세요. 남, 여");
        member[1] = sc.nextLine();
        System.out.println("직업을 입력하세요.");
        member[2] = sc.nextLine();
        System.out.println("나이를 입력하세요.");
        member[3] = sc.nextLine();
        System.out.println("가장 좋아하는 취미를 입력하세요");
        member[4] = sc.nextLine();
        for (int i = 0; i < member.length; i++) {
            System.out.print(member[i]+" ");
        }

    }
}
