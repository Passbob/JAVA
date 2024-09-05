package my.enjoy;

public class 조건문_형석 {

    public static void main(String[] args) {

        조건문_형석 test = new 조건문_형석();
        test.randombox();

    }

    public void randombox(){

        int num = (int)(Math.random()*16);
        if(num >= 10){
            System.out.println("당첨입니다.");
        }else {
            System.out.println("아쉽네요.");
        }

    }


}
