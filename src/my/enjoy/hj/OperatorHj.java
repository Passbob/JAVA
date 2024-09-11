package my.enjoy.hj;

public class OperatorHj {
    public static void main(String[] args) {
        /* 1번
        정수형 2개 선언, 실수형 2개 선언 후 정수형은 왼쪽의 피연산자로, 실수형은 오른쪽의 피연산자로 놓고
        AND 논리 연산자를 통해 true를 반환하시오.
        */

        int inum1 = 3;
        int inum2 = 8;
        double dnum1 = 5.5;
        double dnum2 = 7.5;

        boolean result = inum1<inum2 && dnum1<dnum2;
        System.out.println(result);
//        2번
        int num0 = 1;
        int num1 = 2;
        int num2 = 3;
        int num3 = 4;
        int num4 = 5;
       /* 선언된 정수 5가지 변수를 이용하여
          한곳에 ||(or 연산자) 2개와 &&(and 연산자) 1개를 써서 true를 반환하시오.
          힌트 : boolean 자료형 사용
       */

        boolean result2 = num4>num3 || num3>num2 || num2>num1 && num1>num0;
        System.out.println(result2);

    }
}
