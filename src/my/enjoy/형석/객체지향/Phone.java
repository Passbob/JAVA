package my.enjoy.형석.객체지향;

import java.util.Scanner;

public class Phone {
    Scanner sc = new Scanner(System.in);
    private int activity;

    public void setActivity(int activity) {
        this.activity = activity;
    }

    public void button(){
        if(activity != 1){
            System.out.println("휴대폰이 꺼집니다.");
        }else {
            System.out.println("휴대폰이 켜집니다.");
        }
    }
    public boolean isPatton(){
        boolean isPass = true;
        if(activity == 1){
            System.out.println("=======패턴을 풀어주세요=======");
            System.out.println("     1       2       3      ");
            System.out.println();
            System.out.println("     4       5       6      ");
            System.out.println();
            System.out.println("     7       8       9      ");
            System.out.println();
            System.out.print("패턴의 순서를 입력해주세요 : ");
            int patton = sc.nextInt();
            if(patton == 1235789){
                System.out.println();
                System.out.println("환영합니다.");
                System.out.println();
            }else{
                System.out.println("패턴을 다시 입력해주세요.");
                isPass = false;
            }
        }
        return isPass;
    }
    public void playApp(){
        if(activity == 1){
            System.out.println("앱이 실행됩니다.");
        }else {
            System.out.println("휴대폰이 꺼져있습니다.");
        }
    }
    public void closeApp(){
        if(activity == 1){
            System.out.println("앱을 닫습니다.");
        }else {
            System.out.println("휴대폰이 꺼져있습니다.");
        }
    }






}
