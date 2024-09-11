package my.enjoy.hs;

public class FlowControlHs {

    public static void main(String[] args) {

        FlowControlHs test = new FlowControlHs();
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
