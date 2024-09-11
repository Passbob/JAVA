package my.enjoy.hs;

import java.util.Scanner;

public class MethodHs {

    public static void main(String[] args) {

        /*
        * 1. Math 클래스를 이용해서 -25의 절대값을 반환해라
        * 2. Math 클래스를 이용해서 -20~20범위의 난수를 구하는 코드를 만들어라
        * 3. Scanner와 nextInt()를 이용해서 입력한 문자의 양수와 음수 그리고 0을 반환하는 코드를 만들어라
        * tip . 삼항연산자 or if문을 쓴다고 생각해보세요!
        * */


        System.out.println("-25의 절대값 : " + Math.abs(-25));

        int random = ((int)(Math.random()*41) - 20);
        System.out.println("랜덤값 : " + random);

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 적어주세요 : ");
        int number = sc.nextInt();
        String result = (number > 0)? "양수입니다." : (number == 0)? "0입니다." : "음수입니다." ;
        System.out.println(result);
    }

}
