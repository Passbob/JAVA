package my.enjoy.형석.객체지향;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        /*
        휴대폰 사용 프로그램
        사용자, 휴대폰
        1. 사람은 휴대폰 켜기, 잠금화면을 풀고, 앱을 실행하고, 휴대폰을 끌 수 있다.
        2. 휴대폰은 켜지기, 풀리기, 앱 실행하기, 꺼지기를 할 수 있다.
        3. 휴대폰이 꺼져있을 때 휴대폰 켜기가 실행된다. 만약 켜져있다면 꺼지는 것 하지만 헷갈릴 수 있으니 문구를 날려보내자
        4. 잠금풀기는 켜져있을 때만 반응하고 입력값이 123이어야 해제된다. (패턴 보류) , 틀리면 틀렸다고 반응하고 꺼지기
        5. 앱 실행하기 1 or 2 or 휴대폰 꺼지기 중에 선택가능
        6. 앱을 실행했을 때 앱끄기 , 휴대폰 끄기 중 선택
        7. 앱 끄기하면 7로 돌아가기
        8. 휴대폰 끄기

        메뉴 4개,
        1. 휴대폰 켜기
        2. 패턴풀기
        3. 어플 실행 - 3-1 어플 종료 , 3-2 핸드폰 종료
        4. 휴대폰 종료

        휴대폰 켜져있는지 꺼져있는지 불리언 값
        패턴이 풀려있는지 안풀려있는지 불리언 값
        휴대폰 끄면 패턴 다시 잠금

         */


        Scanner sc = new Scanner(System.in);
        System.out.println("======휴대폰 프로그램======");
        User use = new User();
        int reply = 0;
        do {
            System.out.println("===기능을 선택해주세요.===");
            System.out.println(" 1. 휴대폰 켜기 2. 휴대폰 던지기");
            reply = sc.nextInt();
            if (reply == 1) {
                use.setActivity(1);
                use.pushButton();
                    boolean isPass = use.clearPatton();
                    if (isPass) {
                        for(int j = 0; j < 99; j++) {
                            System.out.println("===기능을 선택해주세요.===");
                            System.out.println(" 1. 1번 앱 실행 2. 2번 앱 실헹 3. 휴대폰 끄기");
                            int reply2 = sc.nextInt();
                            if (reply2 == 1) {
                                use.clickApp();
                                System.out.println("===기능을 선택해주세요.===");
                                System.out.println(" 1. 앱 끄기 2. 휴대폰 끄기 ");
                                int reply3 = sc.nextInt();
                                if (reply3 == 1 || reply3 ==2) {
                                    use.closeApp();
                                } else {
                                    use.setActivity(2);
                                    use.pushButton();
                                    break;
                                }
                            } else {
                                use.setActivity(2);
                                use.pushButton();
                                break;
                            }
                        }
                    }
            }
            }while (reply != 2);

        System.out.println("프로그램을 종료합니다.");
//휴대폰 킨다. -> 패턴 푼다 -> 앱실행 시킨다. -> 앱실행 끈다.

    }
}

