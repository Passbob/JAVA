package my.baekjoon.date0923;


import java.util.Scanner;

public class WhiteArea {

    public static void main(String[] args) {

        /* 체스에서 하얀 판 위의 말 갯수를 구하시오
        * 체스판은 8×8크기이고, 검정 칸과 하얀 칸이 번갈아가면서 색칠되어 있다. 가장 왼쪽 위칸 (0,0)은 하얀색이다. 체스판의 상태가 주어졌을 때, 하얀 칸 위에 말이 몇 개 있는지 출력하는 프로그램을 작성하시오.

            입력
        첫째 줄부터 8개의 줄에 체스판의 상태가 주어진다. ‘.’은 빈 칸이고, ‘F’는 위에 말이 있는 칸이다.

            출력
        첫째 줄에 문제의 정답을 출력한다.

        * */

//        배열로 넣어서 처리하는 것이 좋아보인다.

        WhiteArea w = new WhiteArea();

        w.inputLine();


    }

    public void inputLine(){
        Scanner sc = new Scanner(System.in);
        char[] iL = new char[8];
        int oddWhiteHorse = 0;
        int evenWhiteHorse = 0;


        System.out.println("각 줄의 칸에 말이 존재한다면 F , 존재하지 않는다면 .을 반환하세요");

        for (int i = 0; i < 8; i++) {
            System.out.println(i+1+"번째 줄의 말 유무를 적어주세요. (8칸)");
            String inputText = sc.nextLine();
            for (int put = 0; put < 8; put++) {
                iL[put] = inputText.charAt(put);
            }
            for (int j = 0; j < 8; j++) {
                if(i%2 ==0) {
                    if (j%2 == 0 && iL[j] == 'F') {
                        oddWhiteHorse++;
                    }
                }else{
                    if (j%2 != 0 && iL[j] == 'F') {
                        evenWhiteHorse++;
                    }
                }
            }

        }
        System.out.println("하얀 칸 위의 말 숫자 : "+(oddWhiteHorse+evenWhiteHorse));
    }

}
