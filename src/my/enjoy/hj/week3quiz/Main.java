package my.enjoy.hj.week3quiz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        2번 문제 (코딩 테스트 사이트 문제)
//        조건 1. 비밀번호는 3자리
//
//        조건 2. 비밀번호를 한자리씩 입력한다.
//
//                조건 3. 총 세자리의 번호를 입력하고 비밀번호가 맞으면 통과하고 그렇지 않으면 처음부터 다시 입력합니다.
//
//        조건 4. 비밀번호가 맞으면 성공 메시지를 출력합니다.

        Main main = new Main();

        for (int i = 0; true; i++){
            if(main.pwdIsPass() == true){
                break;
            }else{
                System.out.println("오답입니다.");
            }
        }
        System.out.println("비밀번호가 일치합니다.");

    }

    public boolean pwdIsPass(){

        Scanner sc = new Scanner(System.in);

        boolean pass = true;
        int[] pwd = new int[]{1,2,3};
        int[] pwdEnter = new int[3];

        for (int i = 0; i < 3; i++) {
            pwdEnter[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if(pwd[i] != pwdEnter[i]){
                pass = false;
                break;
            }else {
                pass = true;
            }
        }
        return pass;
    }
}
