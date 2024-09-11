package my.enjoy.hs;

import java.util.Scanner;

public class ForAndWhileHs {

    /*
    * for 혹은 while을 이용해서 아래와 같이 나올 수 있도록 만드시오
    * tip. 오늘 배운 B_while에서 testWhileExample1 과 testWhileExample2를 잘 활용해보세요.
    * */


    public static void main(String[] args) {
        ForAndWhileHs test = new ForAndWhileHs();
        test.forAndWhileQ();
    }




    public void forAndWhileQ(){


            Scanner sc = new Scanner(System.in);
            System.out.print("for 문자열 입력 : ");
            String str = sc.nextLine();

            System.out.println("==============for==================");
            String word = "";
            for(int i = 0; i < str.length(); i++){
                char chi = str.charAt(i);
                word += chi;
                System.out.println(word);

            }

            System.out.println("==============while==================");
            System.out.print("while 문자열 입력 : ");
            String whileStr = sc.nextLine();
            String whileWord = "";
            int i = 0;
            while (i < str.length()){
                char chi = whileStr.charAt(i);
                whileWord += chi;
                System.out.println(whileWord);
                i++;
            }


    }


}
