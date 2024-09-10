package my.enjoy.형석.객체지향;

import java.util.Scanner;

public class Phone {
    Scanner sc = new Scanner(System.in);
    private boolean isactivity;
    private boolean isPass;
    private boolean isAppPlay;

//    public void setActivity(int activity) {
//        this.activity = activity;
//    }

    public void button(){
        if(isactivity){
            this.isactivity = false;
            this.isPass = false;
            System.out.println();
            System.out.println("휴대폰이 꺼집니다.");
            System.out.println();
        }else {
            this.isactivity = true;
            System.out.println();
            System.out.println("휴대폰이 켜집니다.");
            System.out.println();
        }
    }
    public void isPatton(){

        if(isactivity){
            if(isPass){
                System.out.println();
                System.out.println("패턴이 이미 해제되어 있습니다.");
                System.out.println();
            }else {
                System.out.println("=======패턴을 풀어주세요=======");
                System.out.println("     1       2       3      ");
                System.out.println();
                System.out.println("     4       5       6      ");
                System.out.println();
                System.out.println("     7       8       9      ");
                System.out.println();
                System.out.print("패턴의 순서를 입력해주세요 : ");
                int patton = sc.nextInt();
                if (patton == 1235789) {
                    this.isPass = true;
                    System.out.println();
                    System.out.println("환영합니다.");
                    System.out.println();
                } else {
                    System.out.println();
                    System.out.println("패턴을 다시 입력해주세요.");
                    System.out.println();
                    isPass = false;
                }
            }
        }else{
            System.out.println();
            System.out.println("휴대폰이 꺼져있습니다.");
            System.out.println();
        }
    }


    public void playApp() {
        if (isactivity && isPass) {
            if(isAppPlay) {
                System.out.println();
                System.out.println("앱이 이미 실행중입니다.");
                System.out.println();
            }else{
            this.isAppPlay = true;
            System.out.println();
            System.out.println("앱이 실행됩니다.");
            System.out.println();
            }
        } else if(isactivity){
            System.out.println();
            System.out.println("패턴을 해제해주세요");
            System.out.println();
        }else{
            System.out.println();
            System.out.println("휴대폰이 꺼져있습니다.");
            System.out.println();
        }
    }
    public void closeApp(){
        if(isactivity && isAppPlay){
            this.isAppPlay = false;
            System.out.println();
            System.out.println("앱을 닫습니다.");
            System.out.println();
        }else if(isactivity && !isPass) {
            System.out.println();
            System.out.println("패턴을 해제해주세요");
            System.out.println();
        }else if(isactivity && !isAppPlay){
            System.out.println();
            System.out.println("앱이 실행중이 아닙니다.");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("휴대폰이 꺼져있습니다.");
            System.out.println();
        }
    }
}
