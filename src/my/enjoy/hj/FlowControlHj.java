package my.enjoy.hj;

import java.util.Scanner;

public class FlowControlHj {

    public static void main(String[] args) {
        FlowControlHj test = new FlowControlHj();
        test.fruit();
    }

    public void fruit(){

        Scanner sc = new Scanner(System.in);
        System.out.println("===================");
        System.out.println("1.apple  2.banana");
        System.out.println("===================");
        System.out.print("과일을 선택해주세요 : ");
        String push = sc.nextLine();

        if("1".equals(push) || "apple".equals(push) || "1.apple".equals(push)){
            System.out.println("선택하신 것은 apple 입니다.");
        } else if("2".equals(push) || "banana".equals(push) || "2.banana".equals(push)){
            System.out.println("선택하신 것은 banana 입니다.");
        }
    }

}
