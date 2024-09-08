package my.manggom;

import java.util.Scanner;

public class Customer {

    public int SellPage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("안녕하세요 망곰이 굿즈 판매점입니다.");
        System.out.println("=============================================");
        System.out.println(" a. 망곰이 티셔츠 30000원  b. 망곰이 키링 8000원");
        System.out.println(" c. 망곰이 인형 30000원   d. 망곰이 담요 15000원");
        System.out.println(" e. 망곰이 스티커 5000원  f. 망곰이 마우스 30000원");
        System.out.println("=============================================");
        System.out.println("나가기를 원하시면 exit를 입력해주세요.");
        System.out.println();

        System.out.print("원하시는 굿즈의 알파벳을 입력해주세요. : ");
        String product = sc.nextLine();
        int out = 0;
        int dicision = 0;
        if("exit".equals(product)){
            out = 10;
        }else if ("manager".equals(product)){
            out = 20;
        }else {
            System.out.print("원하시는 갯수를 입력해주세요 : ");
            int each = sc.nextInt();
            int price = 0;
            switch (product) {
                case "a":
                    price = 30000;
                    break;
                case "b":
                    price = 8000;
                    break;
                case "c":
                    price = 30000;
                    break;
                case "d":
                    price = 15000;
                    break;
                case "e":
                    price = 5000;
                    break;
                case "f":
                    price = 30000;
                    break;
            }

            if ("a".equals(product) || "b".equals(product) || "c".equals(product) || "d".equals(product) ||
                    "e".equals(product) || "f".equals(product)) {
                sellConfirmed(price, each);
//            이 이후에 sellConfirmed값 가지고 구매내역에 (가격, 갯수, 구매 혹은 취소)3가지 값 들고가기
            }else {
                System.out.println("해당하는 상품이 없습니다.");
            }

        }


        if (out == 10){
            dicision = 1;
        }else if(out == 20) {
            dicision = 2;
        }else {
            dicision = 3;
        }
        System.out.println("dicision = " + dicision);
        return dicision;
    }

    public void sellConfirmed(int pro ,int each){
        Scanner sc = new Scanner(System.in);
        System.out.println("총 금액은 " +(pro*each)+ "원 입니다.");
        System.out.println("구입확정을 원하시면 '1'을 취소를 원하시면 '2'를 입력해주세요");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("구매가 완료되었습니다.");
        } else {
            System.out.println("구매가 취소되었습니다.");
        }

    }



}
